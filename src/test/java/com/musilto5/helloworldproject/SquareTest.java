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
public class SquareTest {
    
    public SquareTest() {
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
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare() {
        System.out.println("square");
        int n = 0;
        Square instance = new Square();
        int expResult = 0;
        int result = instance.square(n);
        assertEquals(expResult, result);
        
        n = 1;        
        expResult = 1;
        result = instance.square(n);
        assertEquals(expResult, result);
        
        n = 2;        
        expResult = 4;
        result = instance.square(n);
        assertEquals(expResult, result);
        
        n = -2;        
        expResult = 4;
        result = instance.square(n);
        assertEquals(expResult, result);
        
    }
    
}
