package org.example;

import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class firstProgram {
    public static void main(String[] args) throws InterruptedException {

//Write a program to print whether a number is even or odd, also take input from the user.
        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        if(a%2==0)
//        {
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }

//Take name as input and print a greeting message for that particular name.
//        String name = scn.nextLine();
//        System.out.println(name);

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.println("Principal");
//        float principal= scn.nextFloat();
//        System.out.println("Time");
//        float time= scn.nextFloat();
//        System.out.println("Rate");
//        float rate= scn.nextFloat();
//        double simpleInterest=(principal*rate*time)/100;
//        System.out.println("SI = "+simpleInterest);

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.println("Enter the number1");
        int num1=scn.nextInt();
        System.out.println("Enter the number2");
        int num2=scn.nextInt();
        System.out.println("Enter the operator");
        String operator=scn.next();
        operator = operator.trim();
        int numResponse;
        if(operator.equals( "+"))
        {
            numResponse=num1+num2;
            System.out.println("Response of " +num1+" "+operator+" "+num2+" = "+numResponse);

        } else if (operator.equals("-")) {
            numResponse=num1-num2;
            System.out.println("Response of " +num1+" "+operator+" "+num2+" = "+numResponse);
        }
        else if (operator.equals("*")) {
            numResponse = num1 * num2;
            System.out.println("Response of " +num1+" "+operator+" "+num2+" = "+numResponse);
        }
        else if (operator.equals("/")) {
            numResponse=num1/num2;
            System.out.println("Response of " +num1+" "+operator+" "+num2+" = "+numResponse);
        }
        else {
            System.out.println("No correct operator selected");
        }
//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.
//To find out whether the given String is Palindrome or not.
//To find Armstrong Number between two given number.

    }

}
