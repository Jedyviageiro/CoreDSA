package com.jedy.coredsa.playground;

public class Calculator {
    
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply( int a, int b){
        return a*b;
    }

    public double divide( double a, double b){
        if(b==0){
            System.out.println("Can't divide a number by zero");
        } else if(a==0){
            System.out.println("Can't divide a number by zero");
        } else {
            return a/b;
        }
        return 0;
    }

    public boolean isEven(int a){
        return a%2==0;
    }

    public boolean isOdd(int a){
        return a%2!=0;
    }
}
