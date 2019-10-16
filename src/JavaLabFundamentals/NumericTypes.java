package JavaLabFundamentals;

//This program demonstrates how numeric types and operators behave in Java

//TASK #2  Add import statement here to use the Scanner class
//TASK #2  (Alternate) Add import statment to use JOptionPane class

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        // TASK #2 Create a Scanner object here (not used for alternate).
        // In the main method, create a Scanner object and connect it to the System.in object.
        Scanner scanner = new Scanner(System.in);

        //identifier declarations
        final int NUMBER = 2;        // number of scores
        final int SCORE1 = 100;        // first test score
        final int SCORE2 = 95;        // second test score
        final int BOILING_IN_F = 212;  // freezing temperature
        int fToC;                        // temperature in celsius
        double average;                // arithmetic average
        String output;                    // line of output to print out
        //TASK #2 declare variables used here
        String firstName;
        String lastName;
        String fullName;

        //TASK #3 declare variables used here
        char firstInitial;
        //TASK #4 declare variables used here
        double diameter;
        double radius;
        double volume;


        // Find an arithmetic average
        // You need to correct logic errors in the average formula and the temperature conversion formula.
        average = (double) (SCORE1 + SCORE2) / NUMBER;
        output = SCORE1 + " and " + SCORE2 + " have an average of "
                + average;
        System.out.println(output);

        // Convert Fahrenheit temperatures to Celsius
        fToC = 5 * (BOILING_IN_F - 32) / 9;
        output = BOILING_IN_F + " in Fahrenheit is " + fToC
                + " in Celsius.";
        System.out.println(output);
        System.out.println();        // to leave a blank line

        // Prompt the user to enter his/her last name.
        System.out.println("Enter your first name ");
        // Read the name from the keyboard using the nextLine method, and store it into a variable called firstName.
        firstName = scanner.nextLine();
        // Prompt the user to enter his/her last name.
        System.out.println("Enter your last name ");
        // Read the name from the keyboard and store it in a variable called lastName.
        lastName = scanner.nextLine();
        // Concatenate the user's first and last names.
        fullName = lastName.concat(" ").concat(firstName);
        // Print out the user's full name.
        System.out.println("Your full name is " + fullName);
        // To leave a blank line.
        System.out.println();

        // ADD LINES FOR TASK #3 HERE
        // get the first character from the user's first name
        // Use the charAt method to get the first character in
        // firstName and store it in a variable called firstInitial.
        firstInitial = firstName.charAt(0);

        // print out the user's first initial
        System.out.println("The user's first initial is " + firstInitial);

        // convert the user's full name to all capital letters
        // Use the toUpperCase method to change the fullName to
        // all capitals and store it back into the fullName variable.
        fullName = fullName.toUpperCase();
        // print out the user's full name in all capital letters
        // Add a line that prints out the value of fullName and how many
        // characters (including the space) are in the string
        // stored in fullName (use the method length to obtain that information).
        System.out.println("The user's full name in all capital letters is " + fullName);
        System.out.println("There are " + fullName.length() + " characters in the string stored in full name");


        System.out.println();        // to leave a blank line

        // ADD LINES FOR TASK #4 HERE
        // prompt the user for a diameter of a sphere
        System.out.println("Enter the diameter of a sphere ");
        // Read in and store the number into a variable called diameter.
        diameter = scanner.nextInt();
        // The diameter is twice as long as the radius,
        // so calculate and store the radius in an appropriately named variable.
        radius = diameter * 2;
        // Volume of a sphere.
        volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
        // Print your results to the screen with an appropriate message.
        System.out.println("The volume of a sphere is " + Math.round(volume * 100.0) / 100.0);
        

    }
}


