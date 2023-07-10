package com.shelzi;


public class Utils {
    static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) return false;
        }
        return true;
    }
}
