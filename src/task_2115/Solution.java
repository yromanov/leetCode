package task_2115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// set for cooked recipes
// add cooked recipes to ingredients
// check recipes until no new are possible

public class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> cookedRecipes = new HashSet<>();
        HashSet<String> suppliesSet = new HashSet<>(Arrays.asList(supplies));

        while (true) {
            boolean newRecipeCooked = false;

            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];
                if (!cookedRecipes.contains(recipe)) {
                    List<String> recipeIngredients = ingredients.get(i);
                    if (suppliesSet.containsAll(recipeIngredients)) {
                        suppliesSet.add(recipe);
                        cookedRecipes.add(recipe);
                        newRecipeCooked = true;
                    }
                }
            }

            if (!newRecipeCooked) {
                break;
            }
        }

        return new ArrayList<>(cookedRecipes);
    }
}