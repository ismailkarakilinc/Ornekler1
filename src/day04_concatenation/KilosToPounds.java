package day04_concatenation;

public class KilosToPounds {

    public static void main(String[] args) {

        /*
        3. Create a class named KilosToPounds and declare the following variables:
                kg
                lb

            3.1 Write a program that can convert the any given number of kilos to pounds
                Ex:
                      kg = 10.5

                output:
                      10.5 kilos is equal to 23.1 pounds

                   Hint:  1kg = 2.2 lb
         */

        double kg = 10.5;
        double lb = 2.2;
        double kgtolb = kg*lb;

        System.out.println(kg + " kilos is equal to " + kgtolb + " pounds");

    }
}
