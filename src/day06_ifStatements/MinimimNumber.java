package day06_ifStatements;

public class MinimimNumber {

    public static void main(String[] args) {

        /*
        1. Create a class named MinimumNumber.java
        2. Declare the following variables:
            1. num1
            2. num2
            3. Write a program that can print the minimum number between the
            two numbers above, if both are equal then print Equal
                Ex:
                num1 = 10
                num2 = 20
                output:
                10 is the minimum number

         */

        int num1 = 10;
        int num2 = 5;

        if (num1<num2){
            System.out.println(num1 + " is the minimum number");
        }else {
            System.out.println(num2 + " is the minimum number");
        }
    }
}
