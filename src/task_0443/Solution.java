package task_0443;


class Solution {
    public int compress(char[] chars) {
        char currentSymbol = chars[0];
        int counter = 1;
        int writeIndex = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentSymbol) {
                counter++;
            } else {
                chars[writeIndex++] = currentSymbol;
                if (counter > 1) {
                    String countStr = String.valueOf(counter);
                    for (int j = 0; j < countStr.length(); j++) {
                        chars[writeIndex++] = countStr.charAt(j);
                    }
                }
                currentSymbol = chars[i];
                counter = 1;
            }
        }

        chars[writeIndex++] = currentSymbol;
        if (counter > 1) {
            String countStr = String.valueOf(counter);
            for (int j = 0; j < countStr.length(); j++) {
                chars[writeIndex++] = countStr.charAt(j);
            }
        }

        return writeIndex;
    }
}