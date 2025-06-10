package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> signsMap = new HashMap<>();
        signsMap.put('I', 1);
        signsMap.put('V', 5);
        signsMap.put('X', 10);
        signsMap.put('L', 50);
        signsMap.put('C', 100);
        signsMap.put('D', 500);
        signsMap.put('M', 1000);
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (signsMap.get(s.charAt(i)) < signsMap.get(s.charAt(i + 1))) {
                    answer -= signsMap.get(s.charAt(i));
                } else {
                    answer += signsMap.get(s.charAt(i));
                }
            }else {
                answer += signsMap.get(s.charAt(i));
            }
        }
        return answer;
    }
}
