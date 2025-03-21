package task_2115;

import java.util.*;



public class Solution {
    // set for cooked recipes
    // add cooked recipes to ingredients
    // check recipes until no new are possible
//    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
//        HashSet<String> cookedRecipes = new HashSet<>();
//        HashSet<String> suppliesSet = new HashSet<>(Arrays.asList(supplies));
//
//        while (true) {
//            boolean newRecipeCooked = false;
//
//            for (int i = 0; i < recipes.length; i++) {
//                String recipe = recipes[i];
//                if (!cookedRecipes.contains(recipe)) {
//                    List<String> recipeIngredients = ingredients.get(i);
//                    if (suppliesSet.containsAll(recipeIngredients)) {
//                        suppliesSet.add(recipe);
//                        cookedRecipes.add(recipe);
//                        newRecipeCooked = true;
//                    }
//                }
//            }
//
//            if (!newRecipeCooked) {
//                break;
//            }
//        }
//
//        return new ArrayList<>(cookedRecipes);
//    }


    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> possibleRecipes = new ArrayList<>();
        HashSet<String> suppliesSet = new HashSet<>(Arrays.asList(supplies));
        Map<String, Integer> recipeToIndex = new HashMap<>();

        for (int idx = 0; idx < recipes.length; idx++) {
            recipeToIndex.put(recipes[idx], idx);
        }

        for (String recipe : recipes) {
            checkRecipe(recipe, ingredients, new HashSet<>(), suppliesSet, recipeToIndex);
            if (suppliesSet.contains(recipe)) {
                possibleRecipes.add(recipe);
            }
        }

        return possibleRecipes;
    }

    private void checkRecipe(
            String recipe,
            List<List<String>> ingredients,
            Set<String> visited,
            Set<String> supplySet,
            Map<String, Integer> recipeToIndex
    ) {
        if (supplySet.contains(recipe)) {
            return;
        }

        if (!recipeToIndex.containsKey(recipe) || visited.contains(recipe)) {
            supplySet.remove(recipe);
            return;
        }

        visited.add(recipe);

        List<String> neededIngredients = ingredients.get(recipeToIndex.get(recipe));
        for (String ingredient : neededIngredients) {
            checkRecipe(ingredient, ingredients, visited, supplySet, recipeToIndex);
            if (!supplySet.contains(ingredient)) {
                supplySet.remove(recipe);
                return;
            }
        }

        supplySet.add(recipe);
    }
}