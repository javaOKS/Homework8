package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        ClassExampels e = new ClassExampels();
        System.out.println(e.isPalindrome(s));
        int[] nums = {1, 2, 3, 1};
        System.out.println(e.containsDublicate(nums));
        int[] num = {2, 7, 11, 15};
        int[] result = e.twoNumSum(num, 9);
        System.out.println(Arrays.toString(result));
    }
}