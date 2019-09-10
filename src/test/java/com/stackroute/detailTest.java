package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class detailTest extends AppTest {
 private  static detail d1;
    @Before
    public void setUp() throws Exception {
        d1=new detail();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastname() {
    }

    @Test
    public void setLastname() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getSalary() {
    }

    @Test
    public void setSalary() {
    }

    @Test
    public void checkAge() {
    }

    @Test
    public void isValidAge() {
    }

    @Test
    public  void getFullName()
    {
        String expected = "yeshu2260000.0";
        d1.setFirstName("yeshu");
        d1.setLastname("tomar");
        d1.setAge(22);
        d1.setSalary(60000);
        String actual = d1.getFullName("yeshu","tomar");
        Assert.assertNotEquals(expected, actual);
    }
}