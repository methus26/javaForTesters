package net.methus.chap003myfirsttest.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answerAdd = 2 + 2;
        assertEquals("2 + 2 = 4", 4, answerAdd);
    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int answerSubtract = 2 - 2;
        assertEquals("2 - 2 = 0", 0, answerSubtract);
    }

    @Test
    public void canMultiplyTwoByTwo(){
        int answerMultipy = 2 * 2;
        assertEquals("2 * 2 = 4", 4, answerMultipy);
    }

    @Test
    public void canDivideFourByTwo(){
        int answerDivide = 4 / 2;
        assertEquals("4 / 2 = 2", 2, answerDivide);
    }
}