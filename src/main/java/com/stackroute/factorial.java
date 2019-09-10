package com.stackroute;

public class factorial {
    public  String fact(int n){
        int factorial = 1;
        if (n == 0)
            factorial = 1 ;
        else if(n >=13)
        {
            String str = "the value is out  of range.";
            return str;
        }
        else
            for (int i = 1; i <= n; i++)
            {
                factorial = factorial*i;
//
            }
        return String.valueOf(factorial);
    }
    public String fact1(int n){
        long factorial=1;
        if (n == 0)
            factorial = 1;
        else if(n >=21) {
            String str = "the value is out  of range.";
            return str;
        }
        else
        {
            for (int i=1; i <= n; i++){
                factorial = factorial*i;
//                System.out.println("The factorial of "+ num + "is " + factorial +" ");
            }
        }
        return String.valueOf(factorial);
    }
}


