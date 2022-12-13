package day09_practice;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your gender: ");
        String gender = input.next();

        System.out.print("Enter your full name: ");
        input.nextLine();
        String name = input.nextLine();


        System.out.print("Enter your phone number: ");
        long phoneNumber = input.nextLong();

        input.nextLine();

        System.out.print("Enter your zip code: ");
        int zipcode = input.nextInt();

        input.nextLine();

        System.out.print("Enter your school name: ");
        String schoolName = input.nextLine();



        System.out.print("Enter your city name: ");
        String cityName = input.nextLine();




        System.out.print("Enter your state name: ");
        String stateName = input.next();

        input.nextLine();


        System.out.print("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();


        System.out.print("Enter your street name: ");
        String streetName = input.nextLine();

        input.close();




        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println("Address: " + buildingNumber + " " + streetName + "\n\t\t  " +  cityName + ", "
                            + stateName + " " + zipcode);
        System.out.println(schoolName);



    }
}
/*
11. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name


 */