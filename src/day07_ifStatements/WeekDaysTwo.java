package day07_ifStatements;

public class WeekDaysTwo {

    public static void main(String[] args) {

        int number = 31;  // 1~7
        String result = "";

        if (number>=1 && number<8){

            if (number==1){
                result="Monday";
            } else if (number==2){
                result="Tuesday";
            }else if (number==3){
                result="Wednesday";
            }else if (number==4){
                result="Thursday";
            }else if (number==5){
                result="Friday";
            }else if (number==6){
                result="Saturday";
            }else {
                result="Sunday";
            }
            System.out.println(result);
        }else {
            System.out.println("Invalid Number.");
        }

    }
}
