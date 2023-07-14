package com.nopcommerce.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGSoftAssert {

    @Test
    public void hardAssertExample() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running test --------------->");
        Assert.assertTrue(result == 30);
        System.out.println("Line after assert 1");
        Assert.assertTrue(result == 30);
        System.out.println("Line after assert 2");
    }

    @Test
    public void softAssertExample() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running test --------------->");
        System.out.println("Line after assert 1");
        System.out.println("Line after assert 2");
    }
}
