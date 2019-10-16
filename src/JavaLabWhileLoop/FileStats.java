package JavaLabWhileLoop;

//  To calculate the statistics on a file of numbers

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileStats {
    private double mean;    //the arithmetic average
    private double stdDev;  //the standard deviation

    //Constructor calls calculateMean and calculateStdDev methods
    //and store the results in the respective instance variables
    public FileStats(String filename) throws FileNotFoundException {
        mean = calculateMean(filename);
        stdDev = calculateStdDev(filename);
    }

    //returns the mean
    public double getMean() {
        return mean;
    }

    //returns the standard deviation
    public double getStdDev() {
        return stdDev;
    }

    //returns the calculated arithmetic average
    public double calculateMean(String filename) throws FileNotFoundException {
        //ADD LINES FOR TASK 4
        // Create a FileReader object passing it the filename.
        FileReader fileReader = new FileReader(filename);
        // Create a BufferedReader object passing it the FileReader object.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner input = new Scanner(fileReader);
        // Declare local variables for an accumulator of type double,
        // a counter of type integer, and line of type String.
        // Initialize all number variables to 0.
        double accumulator = 0;
        int counter = 0;
        // Write a loop that continues until you are at the end of the file.
        while (true) {
            // Convert the line into a double value and add the value to the accumulator.
            accumulator += input.nextDouble();
            // Increment the counter.
            counter += 1;
            // Read a new line from the file.
            if (!input.hasNext()) {
                break;

            }

        }

        // When the program exits the loop close the input file.
        input.close();
        // The mean is calculated by dividing the accumulator by the counter.
        return accumulator / counter;

    }

    //returns the calculated standard deviation
    public double calculateStdDev(String filename) throws FileNotFoundException {
        //ADD LINES FOR TASK 5
        // Create a FileReader object passing it the filename.
        FileReader fileReader = new FileReader(filename);
        // Create a BufferedReader object passing it the FileReader object.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner input = new Scanner(fileReader);
        // Declare local variables for an accumulator of type double,
        // a counter of type integer, and line of type String.
        // Initialize all number variables to 0.
        double accumulator = 0;
        int counter = 0;
        // Create a local variable called difference of type double.
        double difference = 0;
        // Write a loop that continues until you are at the end of the file.
        while (true) {
            // Convert the line into a double value and subtract the mean, store the result in difference.
            difference = input.nextDouble() - mean;
            // Add the square of the difference to the accumulator.
            accumulator += Math.pow(difference, 2);
            // Increment the counter.
            counter += 1;
            // Read a new line from the file.
            if (!input.hasNext()) {
                break;

            }

        }
        // When the program exits the loop close the input file.
        input.close();
        // The standard deviation is calculated by taking the square root of the accumulator divided by the counter.
        return Math.sqrt(accumulator / counter);


    }
}



