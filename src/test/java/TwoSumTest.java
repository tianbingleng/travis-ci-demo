import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    TwoSum testDrive = new TwoSum();

    @Test
    public void test_1() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = testDrive.solution(nums, target);
        int[] expect = new int[]{0, 1};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test_2() {
        int[] nums = new int[]{2,7,11,15};
        int target = 10;
        int[] result = testDrive.solution(nums, target);
        Assert.assertArrayEquals(null, result);
    }

    @Test
    public void test_3() {
        int[] nums = new int[]{2,7,11,15};
        int target = 13;
        int[] result = testDrive.solution(nums, target);
        int[] expect = new int[]{0, 2};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test_4() {
        int[] nums = new int[]{2,7,11,15};
        int target = 18;
        int[] result = testDrive.solution(nums, target);
        int[] expect = new int[]{1, 2};
        Assert.assertArrayEquals(expect, result);
    }

}
