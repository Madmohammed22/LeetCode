
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static Hashtable<Integer, Integer> map = new Hashtable<>();

    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int current : arr)
            result.add(current);
        for (Integer current : result) {
            if (map.containsKey(current))
                map.put(current, map.get(current) + 1);
            else
                map.put(current, 1);
        }
        result.clear();
        int maxValue = Collections.max(map.values());
        while (maxValue > 1 ) {
            for(Map.Entry<Integer, Integer> current : map.entrySet()){
                if (current.getValue() == maxValue)
                    result.add(current.getKey());
                
            }
            maxValue --;
        }
        result.add()
        System.out.println(map);
        return result;
    }
}

// in case if two key has the same number the higher one is gonna be the first
// in the array.
class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[] arr = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int[] arr = { 7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9 };
        // [5, 11, 7, 10]
        int k = 2;
        System.out.println(solution.topKFrequent(arr, k));
    }
}
