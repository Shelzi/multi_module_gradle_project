package com.shelzi;

import static com.shelzi.StringUtils.isPositiveNumber;

public class Utils {
    static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!isPositiveNumber(s)) return false;
        }
        return true;
    }
}
