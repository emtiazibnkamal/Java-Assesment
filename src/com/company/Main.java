package com.company;

public class Main {
    float c;
    public static void main(String[] args) {
	// write your code here
        float c, d;
        int a= 2;
        int b= 0;
        try {

             c=b+a;
            d=a/b;
            System.out.println("The Result is "+ c);
            System.out.println("The Result is "+ d);

        }catch(ArithmeticException e) {
            System.out.println("Aruthematic Exception thrown  :" + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(" ArrayIndexOutOfBounds Exception thrown  :" + e);
        }
        System.out.println("exception end");
    }

}
