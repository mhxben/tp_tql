package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Test1.class);
        for(Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println("the result of test : " + result.wasSuccessful());
    }
}