package JavaLabFundamentals;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;

        Scanner scanner = new Scanner(System.in);
        // Print a line indicating this program will calculate mileage.
        System.out.println("This program will calculate mileage ");
        // Print prompt to user asking for miles driven.
        System.out.println("Enter the miles driven ");
        // Read in miles driven
        miles = scanner.nextDouble();
        // Print prompt to user asking for gallons used
        System.out.println("Enter the gallons used ");
        // Read in gallons used
        gallons = scanner.nextDouble();
        // Calculate miles per gallon by dividing miles driven by gallons used
        mpg = miles / gallons;
        // Print miles per gallon along with appropriate labels
        System.out.println("Miles per gallons is " + String.format("%.2f", mpg));


    }
}
