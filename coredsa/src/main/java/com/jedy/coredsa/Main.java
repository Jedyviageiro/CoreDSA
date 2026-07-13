package com.jedy.coredsa;

import com.jedy.coredsa.playground.Calculator;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ){
        
        Calculator cal = new Calculator();

        System.out.println("Addition: " + cal.add(10, 5));
        System.out.println("Subtraction: " + cal.subtract(10, 5));
        System.out.println("Multiplication: " + cal.multiply(10, 5));
        System.out.println("Division: " + cal.divide(10, 5));
        System.out.println("Is 10 even? " + cal.isEven(10));
        System.out.println("Is 7 odd? " + cal.isOdd(7));

    }
}
