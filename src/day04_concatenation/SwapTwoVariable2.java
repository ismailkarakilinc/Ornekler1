package day04_concatenation;

public class SwapTwoVariable2 {

    public static void main(String[] args) {

        /*
        9. Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

            9.1 Write a program that swap variables x & y’ values without using any temporary variables
                Ex:
                      x = 10
                      y = 15

                output:
                          x = 15
                          y = 20

         */

        int x = 10;
        int y = 15;

        x=y-x;
        y=y+x;
        x=y-x;

        System.out.println("x= " + x + "\ny= " + y);







    }
}
