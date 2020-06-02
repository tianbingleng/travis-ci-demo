import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        // Time: O(n)
        // Space: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                // we should return the result
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public void fixbug() {
        System.out.println("Just a comment");
    }

    public void feature_method() {
        System.out.println("comment for feature branch");
    }

    public void feature_method_2() {
        System.out.println("comment 2 for feature branch");
    }
}
