package com.Bridgelabz;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check = " );
        int n=scanner.nextInt();

        if(n%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("number is odd");
        }
    }

}
