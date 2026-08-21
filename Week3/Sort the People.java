import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        // Map height to name
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        // Sort heights array in ascending order
        Arrays.sort(heights);
        
        // Populate result array in descending order of heights
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(heights[n - 1 - i]);
        }
        
        return result;
    }
}
