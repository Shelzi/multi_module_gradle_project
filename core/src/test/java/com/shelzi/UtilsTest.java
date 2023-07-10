package com.shelzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.shelzi.Utils.isAllPositiveNumbers;
class UtilsTest {

    @Test
    void isAllPositiveNumbersTest() {
        assertTrue(isAllPositiveNumbers("1", "2"));
    }
}