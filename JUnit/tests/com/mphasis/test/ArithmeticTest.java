package com.mphasis.test;

import com.mphasis.math.Arithmetic;
import org.junit.Test;
public class ArithmeticTest {
    @Test
    public void testSum(){
        int expectedResult=6;
        Arithmetic arithmetic=new Arithmetic();
        int actualResult=arithmetic.sum(2,4);
        assertEquals(expectedResult, actualResult);

    }
}
