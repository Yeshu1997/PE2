package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest extends AppTest {
 private static palindrome palindrome;

public class detail {
}

    @Before
    public void setUp() throws Exception {
        palindrome = new palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public  void test1(){
        int expected=54321;
        int actual;
        actual = palindrome.reverseDigits(12345);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void test2(){
        int expected=12321;
        int actual;
        actual = palindrome.reverseDigits(12321);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public  void test3(){
        int expected=12322;
        int actual;
        actual = palindrome.reverseDigits(12355);
        Assert.assertNotEquals(actual,expected);
    }

}