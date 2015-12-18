/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musilto5.helloworldproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomas
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFactorial method, of class Factorial.
     */
    @Test
    public void testGetFactorial() {
        System.out.println("getFactorial");
        int n = 0;
        Factorial instance = new Factorial();
        int expResult = 1;
        int result = instance.getFactorial(n);
        assertEquals(expResult, result);
        n = 2;
        expResult = 2;
        result = instance.getFactorial(n);
        assertEquals(expResult, result);
        n = 3;
        expResult = 6;
        result = instance.getFactorial(n);
        assertEquals(expResult, result);
        
       fail("Test failed");
        
    }
    
}
