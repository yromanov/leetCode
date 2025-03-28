package task_2503;


import java.util.*;

public class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int maxX = grid.length;
        int maxY = grid[0].length;
        int[] sortedQueries = queries.clone();
        Arrays.sort(sortedQueries);
        Map<Integer, Integer> resultMap = new HashMap<>();

        Queue<int[]> front = new LinkedList<>();
        front.add(new int[]{0, 0});
        Stack<int[]> lastFront = new Stack<>();
        boolean[][] visited = new boolean[maxX][maxY];

        int counter = 0;
        for (int value : sortedQueries) {
            while (!front.isEmpty()) {
                int[] currentCell = front.poll();
                int x = currentCell[0];
                int y = currentCell[1];
                if (grid[x][y] < value) {
                    if (visited[x][y]) {
                        continue;
                    } else {
                        visited[x][y] = true;
                    }
                    counter++;
                    if (x < maxX - 1) {
                        front.add(new int[]{x + 1, y});
                    }
                    if (y < maxY - 1) {
                        front.add(new int[]{x, y + 1});
                    }
                    if (x > 0) {
                        front.add(new int[]{x - 1, y});
                    }
                    if (y > 0) {
                        front.add(new int[]{x, y - 1});
                    }
                } else {
                    lastFront.add(currentCell);
                }
            }
            resultMap.put(value, counter);
            front.addAll(lastFront);
            lastFront.clear();
        }

        return Arrays.stream(queries).map(resultMap::get).toArray();
    }
}