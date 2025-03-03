package task_0345;

// ideas:
// - to get array of vowels and replace them going from end to start. traversing two times + extra memory
// - two pointers from start and end. single traversal, no extra memory

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] array = s.toCharArray();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer) {
            while(leftPointer < rightPointer && !vowels.contains(array[leftPointer])) {
                leftPointer++;
            }

            while(rightPointer > leftPointer && !vowels.contains(array[rightPointer])) {
                rightPointer--;
            }

            char temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        return new String(array);
    }
}