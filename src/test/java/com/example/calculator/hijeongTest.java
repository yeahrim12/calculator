package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class hijeongTest {
    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);

        assertEquals("add 함수의 결과는 9이어야 합니다.",9, result);
    }

}
