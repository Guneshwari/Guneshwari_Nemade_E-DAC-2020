package com.company;
import java.util.Scanner;
public class A5{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println( "Input First number");
	int num1 = in.nextInt();

	System.out.println("Input second number");
	int num2 = in.nextInt();

        System.out.println( num1 + "x" +num2 + "=" + num1 * num2);
    }
}

****************************************************************
Input First number
25
Input second number
5
25x5=125

Process finished with exit code 0