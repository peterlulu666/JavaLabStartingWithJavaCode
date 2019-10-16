package JavaLabString;

import java.util.Scanner;

public class TimeDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char answer = 'Y';
        String enteredTime;
        String response;

        // In the TimeDemo class,
        // add a condition to the loop
        // that converts the user’s answer to
        // a capital letter prior to checking it.
        // CHECK ANSWER AFTER CONVERTING TO CAPITAL
        while (answer == 'Y') {
            System.out.print(
                    "Enter a miitary time using the ##:## form   ");
            enteredTime = keyboard.nextLine();
            Time now = new Time(enteredTime);
            System.out.println(
                    "Do you want to enter another (Y/N)?  ");
            response = keyboard.nextLine();
            answer = response.charAt(0);
        }

    }
}


