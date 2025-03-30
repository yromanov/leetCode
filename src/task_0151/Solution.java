package task_0151;


class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i > 0; i--){
            String word = words[i];
            if(!word.isEmpty()) {
                sb.append(word).append(" ");
            }
        }

        sb.append(words[0]);

        return sb.toString();
    }
}