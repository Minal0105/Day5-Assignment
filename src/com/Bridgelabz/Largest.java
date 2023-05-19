package com.Bridgelabz;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First No.");
        int n1=scanner.nextInt();
        System.out.println("Enter Second No.");
        int n2=scanner.nextInt();
        System.out.println("Enter Third No.");
        int n3=scanner.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println(n1+ " is greter than " +n2+ " & " +n3);
        }else if(n2>n1&&n2>n3){
            System.out.println(n2+ " is greter than " +n1+ " & " +n3);
        }else
            System.out.println(n3+ " is greter than " +n1+ " & " +n2);
    }
}
