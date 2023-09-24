import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;
        final int ma = target;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            System.out.println(complement);
            System.out.println(numMap.containsKey(complement));
            System.out.println(numMap.get(complement));
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[]{};
    }
}
