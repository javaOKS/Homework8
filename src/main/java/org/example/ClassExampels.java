package org.example;

import java.util.Arrays;

public class ClassExampels {

    public boolean isPalindrome(String str) {
        if (str.equals("") || str.length() == 1)
            return true;
        str = str.toLowerCase();
        return isPalindrome(str, 0, str.length() - 1);
    }

    private boolean isPalindrome(String s, int x, int y) {
        if (x == y || x > y)
            return true;
        if (!Character.isLetterOrDigit(s.charAt(x)))
            return isPalindrome(s, x + 1, y);
        else if (!Character.isLetterOrDigit(s.charAt(y)))
            return isPalindrome(s, x, y - 1);
        else if (s.charAt(x) == s.charAt(y))
            return isPalindrome(s, x + 1, y - 1);
        return false;
    }

    public boolean containsDublicate(int[] nums) {
        return nums.length != Arrays.stream(nums).distinct().toArray().length;
    }

    public int[] twoNumSum(int[] nums, int target) {
        int[] index = new int[2];
        int low = 0;
        int high = nums.length - 1;
        nums = Arrays.stream(nums).sorted().toArray();
        while (low < high) {
            if (nums[low] + nums[high] == target) {
                index[0] = low;
                index[1] = high;
                return index;
            }
            if (nums[low] + nums[high] < target) {
                low++;
            }
            high--;
        }
        return index;
    }
}
