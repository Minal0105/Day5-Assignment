package com.Bridgelabz;
public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length == 1){
            int n = Integer.parseInt(args[0]);
            if (n >= 0) {
                System.out.println("Powers of 2 up to 2^" + n + ":");
                for (int i = 0; i <= n; i++) {
                    int power = (int) Math.pow(2, i);
                    System.out.println("2^" + i + " = " + power);
                }
            } else {
                System.out.println("N must be a non-negative integer.");
            }

            }
        }
}


