package com.Bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year= scanner.nextInt();
        if((year%400==0)&&(year%100==0)&&(year%400==0)) {
            System.out.println("Entered year is a leap year");
        }
      else
            System.out.println("Entered year is not a leap year");
        }
    }

