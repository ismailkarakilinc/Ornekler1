package day19_Array;

import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 0 && scores[i] <=100);

            if (scores[i] >=90 && scores[i] <=100){
                grades[i]='A';
            }else if (scores[i] >=79 && scores[i] <=89){
                grades[i]='B';
            }else if (scores[i] >=69 && scores[i] <=79){
                grades[i]='C';
            } else if (scores[i] >=59 && scores[i] <=69) {
                grades[i]='D';
            } else {
                grades[i]='F';
            }
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);

        }
    }
}
/*

4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */
