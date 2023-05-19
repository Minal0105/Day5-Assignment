package com.Bridgelabz;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of times to flip coin =");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }
    }}

