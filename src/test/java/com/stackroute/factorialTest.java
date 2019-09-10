package com.stackroute;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class factorialTest extends AppTest {


        private static factorial factorial;

        @BeforeClass
        public static void setUp() throws Exception {
            factorial = new factorial();
        }
        @AfterClass
        public static void tearDown() throws Exception {
        }
        @Test
        public void validInput1()
        {
            String expected = "120";
            String actual = factorial.fact(5);
            Assert.assertEquals(expected, actual);
        }
    @Test
    public void validInput3()
    {
        String expected = "120";
        String actual = factorial.fact1(14);
        Assert.assertNotEquals(expected, actual);
    }
        @Test
        public void validInput2()
        {
            String expected = "the value is out  of range.";
            String actual = factorial.fact1(21);
            Assert.assertEquals(expected, actual);
        }
    }
