package com.stackroute;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class evenTest extends AppTest {

    private static even e1;

    @BeforeClass
    public static void setUp() throws Exception {
        e1 = new even();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
@Test
    public void test1(){
    boolean expected=true;
    boolean actual=e1.isEven(24);
    Assert.assertEquals(expected, actual);
}
    @Test
    public void test2(){
        boolean expected=false;
        boolean actual=e1.isEven(23);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        boolean expected=true;
        boolean actual=e1.isEven(23);
        Assert.assertNotEquals(expected, actual);
    }
}