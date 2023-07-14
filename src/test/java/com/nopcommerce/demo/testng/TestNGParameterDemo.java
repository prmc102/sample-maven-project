package com.nopcommerce.demo.testng;

import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGParameterDemo {

    @Test
    public void test(String name) {
        System.out.println("My name is : " + name);
    }
}
