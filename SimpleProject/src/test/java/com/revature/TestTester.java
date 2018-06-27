package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.Testit;

public class TestTester {

    @Test
    public void test1() {
        assertEquals("Should return true", true, (new Testit().check()));
    }
    @Test
    public void test2() {
    	assertEquals("Should fail", false, (new Testit().check()));
    }
}