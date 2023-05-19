package com.Bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int dividend=scanner.nextInt();
        System.out.println("Enter second number");
        int divisor=scanner.nextInt();
        int quotient=dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("quotient of above numbers divison is "+quotient);
        System.out.println("remainder of above numbers divison is "+remainder);;

    }
}
