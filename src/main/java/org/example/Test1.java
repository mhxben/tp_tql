package org.example;

import org.junit.*;


public class Test1 {

//    @Before
//    public void before() {
//        System.out.println("Before Test1");
//    }

    @Test
    public void method1(){
        boolean value = false;
        Assert.assertFalse(value);
        System.out.println("@Test annotation");
    }

    @After
    public void m2(){
        System.out.println("@After annotation");
    }
    @Before
    public void m3(){
        System.out.println("@Before annotation");
    }
    @Ignore
    public void m4(){
        System.out.println("@Ignore annotation");
    }


//    @After
//    public void after() {
//        System.out.println("After Test1 Done");
//    }


}