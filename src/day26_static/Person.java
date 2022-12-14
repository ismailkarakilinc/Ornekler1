package day26_static;

public class Person {

    public String name;
    public  int age;
    public char gender;

    public static boolean isHuman;
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead;
    public static int numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        isHuman = true;
        hasNose = true;
        hasWings = false;
        numberOfEyes = 2;
        numberOfHead = 1;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isHuman=" + true +
                ", hasNose=" + true +
                ", hasWings=" + false +
                ", numberOfEyes=" + 1 +
                ", numberOfHead=" + 2 +
                '}';
    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()

 */
