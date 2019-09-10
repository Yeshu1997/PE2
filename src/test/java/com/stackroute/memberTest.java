package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class memberTest extends AppTest {
    private static member member;

    @Before
    public void setUp() throws Exception {
        member = new member();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void getName() {
    }
    @Test
    public void setName() {
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
    public void displayDetails() {
        String expected = "yeshu2260000.0";
        member.setName("yeshu");
        member.setAge(22);
        member.setSalary(60000);
        String actual = member.displayDetails();
        Assert.assertEquals(expected, actual);
    }
}

