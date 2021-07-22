package hw9;

import java.util.Map;
import java.util.HashMap;

public final class HW9 {
    private HW9() {
        //
    }

    public static int romanToInteger(String str) {
        int intConversion = 0;

        Map<Character, Integer> romanSymbol = new HashMap<>();
        romanSymbol.put('I', 1);
        romanSymbol.put('V', 5);
        romanSymbol.put('X', 10);
        romanSymbol.put('L', 50);
        romanSymbol.put('C', 100);
        romanSymbol.put('D', 500);
        romanSymbol.put('M', 1000);

        for (int i = 0; i < str.length() - 1; i++) {
            if (romanSymbol.get(str.charAt(i)) >= romanSymbol.get(str.charAt(i + 1))) 
                intConversion += romanSymbol.get(str.charAt(i));
            else intConversion -= romanSymbol.get(str.charAt(i));
        }

        return intConversion;
    }
}
