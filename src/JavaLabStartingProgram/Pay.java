package JavaLabStartingProgram;

//This program calculates the user's gross pay

import java.util.Scanner;  	//to be able to read from the keyboard

public class Pay
{
    public static void main(String [] args)
    {
        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //identifier declarations
        double hours;	//number of hours worked
        double rate;	//hourly pay rate
        double pay;		//gross pay

        // Display prompts and get input.
        // Display “How many hours did you work?”
        System.out.print("How many hours did you work? ");
        // Input hours.
        hours = keyboard.nextDouble();
        // Display “How much do you get paid per hour?”
        System.out.print("How much do you get paid per hour? ");
        // Input rate.
        rate = keyboard.nextDouble();

        //calculations
        if(hours <= 40)
            pay = hours * rate;
        else
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;

        //display results
        System.out.println("You earned $" + pay);
    }
}


