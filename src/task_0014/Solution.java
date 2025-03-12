package task_0014;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (String string : strs) {
            while (!string.startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    break;
                }
            }
        }

        return result;
    }
}