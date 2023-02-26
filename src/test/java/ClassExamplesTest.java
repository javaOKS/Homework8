import org.example.ClassExampels;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassExamplesTest {

    @Test
    public void isPalindromeTest() {
        ClassExampels exampels = new ClassExampels();
        String str = "A man, a plan, a canal: Panama";
        boolean result = exampels.isPalindrome(str);
        Assert.assertEquals(true, result);
    }

    @Test
    public void isPalindromeNegativeTest() {
        ClassExampels exampels = new ClassExampels();
        String str = "race a car";
        boolean result = exampels.isPalindrome(str);
        Assert.assertEquals(false, result);
    }

    @Test
    public void containsDublicateTest() {
        ClassExampels exampels = new ClassExampels();
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = exampels.containsDublicate(nums);
        Assert.assertEquals(true, result);
    }

    @Test
    public void containsDublicateNegativeTest() {
        ClassExampels exampels = new ClassExampels();
        int[] nums = {1, 2, 3, 4};
        boolean result = exampels.containsDublicate(nums);
        Assert.assertEquals(false, result);
    }

    @Test
    public void twoNumSumTest() {
        ClassExampels exampels = new ClassExampels();
        int[] nums = {2, 7, 11, 15};
        int[] result = exampels.twoNumSum(nums, 9);
        int[] expect = {0, 1};
        Assert.assertEquals(true, Arrays.equals(expect, result));
    }
}
