package day13_customMethods;

public class Min {

    public static void main(String[] args) {

        System.out.println(min(21,20));


    }
    public static int min ( int num1 , int num2){

        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
/*
4. Create a method named min, that can return the minimum number between two numbers

 */
