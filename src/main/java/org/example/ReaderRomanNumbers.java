package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReaderRomanNumbers {
    public int romanToInt(String s) {
        int index = 0, result = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        while (index < s.length()) {
            numbers.add(map.get(s.charAt(index)));
            index++;
        }
        index = 0;
        while (index < numbers.size()) {
            if (index == numbers.size() - 1) {
                result += numbers.get(index);
                break;
            }
            if (numbers.get(index) < numbers.get(index + 1)) {
                result += (numbers.get(index + 1) - numbers.get(index));
                index += 2;
            } else {
                result += numbers.get(index);
                index++;
            }
        }
        return result;
    }

}
