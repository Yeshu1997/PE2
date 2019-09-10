package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class power4Test extends AppTest {
private  static power4 power4;
    @Before
    public void setUp() throws Exception {
        power4=new power4();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public  void test1(){
      int  expected=1;
      int actual=power4.isPowerOfFour(1);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public  void test2(){
        int  expected=0;
        int actual=power4.isPowerOfFour(0);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public  void test3(){
        int  expected=1;
        int actual=power4.isPowerOfFour(0);

        Assert.assertNotEquals(actual,expected);
    }
}