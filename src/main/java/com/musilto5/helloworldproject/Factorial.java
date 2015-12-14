/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.musilto5.helloworldproject;

/**
 *
 * @author tomas
 */
public class Factorial {
    
    public int getFactorial(int n){
        if(n < 0)
            throw new IllegalArgumentException("Number must be greater than 0");
        if(n == 0)
            return 1;
        return n * getFactorial(n - 1);
        
    }
    
}
