package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Test1 {

    @Before
    public void before() {
        System.out.println("Before Test1");
    }

    @Test
    public void test() {
        boolean testEquation = true;
        Assert.assertTrue(testEquation);
        //System.out.println(testEquation);
        testEquation = false;
        Assert.assertFalse(testEquation);
        //System.out.println(testEquation);
    }

    @After
    public void after() {
        System.out.println("After Test1 Done");
    }
}