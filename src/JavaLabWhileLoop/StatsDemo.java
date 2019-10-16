package JavaLabWhileLoop;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StatsDemo {
    public static void main(String[] args) throws IOException {
        // Create a DecimalFormat object so that we can format our numbers for output with 3 decimal places.
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        // Create a Scanner object to get the file name input from the user.
        Scanner scanner = new Scanner(System.in);
        // Prompt the user and read in the file name.
        // The file name would be "src/JavaLabWhileLoop/Numbers.txt".
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        FileReader file = new FileReader(fileName);
        // Create a FileStats object passing it the file name.
        FileStats fileStats = new FileStats(fileName);
        // Create a FileWriter object passing it the filename “Results.txt”.
        FileWriter fileWriter = new FileWriter("src/JavaLabWhileLoop/Results.txt");
        // Create a PrintWriter object passing it the FileWriter object.
        PrintWriter printWriter = new PrintWriter(fileWriter);
        // Print the mean and standard deviation to the output file using a three decimal format, labeling each.
        System.out.println("Mean: " + decimalFormat.format(fileStats.getMean()) +
                "\n" + "Standard Deviation: " + decimalFormat.format(fileStats.getStdDev()));


    }
}
