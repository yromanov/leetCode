package task_3169;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int countDays(int days, int[][] meetings) {
        int result = 0;
        TreeMap<Integer, Integer> meetingsDiffMap = new TreeMap<>();

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            meetingsDiffMap.put(start, meetingsDiffMap.getOrDefault(start, 0) + 1);
            meetingsDiffMap.put(end + 1, meetingsDiffMap.getOrDefault(end + 1, 0) - 1);
        }

        int firstKey = meetingsDiffMap.firstKey();
        int lastKey = meetingsDiffMap.lastKey();

        result += firstKey - 1;
        result += days - lastKey + 1;

        int sum = 0;
        int prevTime = firstKey;
        for (Map.Entry<Integer, Integer> entry : meetingsDiffMap.entrySet()) {
            if (sum == 0) {
                result += entry.getKey() - prevTime;
            }
            sum += entry.getValue();
            prevTime = entry.getKey();
        }

        return result;
    }
}