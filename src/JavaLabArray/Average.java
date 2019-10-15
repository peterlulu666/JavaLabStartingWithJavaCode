package JavaLabArray;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    // This class will allow a user to enter 5 scores into an array
    // The array which will contain the scores
    private int[] data;
    // The arithmetic average of the scores
    private double mean;

    // The constructor will allocate memory for the array.
    // Use a for loop to repeatedly display
    // a prompt for the user which should indicate that use.
    // The constructor will then call the selectionSort and the calculateMean methods.
    public Average() {
        this.data = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            int number = scanner.nextInt();
            this.data[i] = number;


        }

    }

    // this is a method that uses a for loop to access
    // each score in the array and add it to a running total.
    // The total divided by the number of scores (use the length of the array),
    // and the result is stored into mean.
    public void calculateMean() {
        int totalNumber = 0;
        for (int i = 0; i < data.length; i++) {
            totalNumber = data[i] + totalNumber;

        }

        this.mean = (double) totalNumber / data.length;

    }

    // Returns a String containing data in descending order and the mean
    // Returns array of element
    public String toStrong() {
//        String dataOrder = "Data in descending order: ";
//        for (int i = 0; i < this.data.length; i++) {
//            dataOrder += this.data[i] + " ";
//
//        }
//
//        return dataOrder.concat(" \n").concat("Mean: " + this.mean);

//        int [] sortedData = new int[5];
//        for (int i = 0; i < this.data.length; i++) {
//            sortedData[i] = this.data[i];
//
//        }
//
//        return ("Data in descending order: ").concat
//                (Arrays.toString(sortedData)).concat
//                (" \n").concat
//                ("Mean: ").concat
//                (String.valueOf(this.mean)).concat
//                (" \n").concat
//                ("Mean: ").concat
//                (Double.toString(this.mean));

        return ("Data in descending order: ").concat
                (Arrays.toString(this.data)).concat
                (" \n").concat
                ("Mean: ").concat
                (String.valueOf(this.mean)).concat
                (" \n").concat
                ("Mean: ").concat
                (Double.toString(this.mean));


    }

    // Sort the data.
    // It will rearrange the data set from highest to lowest.
    public void selectionSort() {
        for (int boundary = 0; boundary < this.data.length; boundary++) {
            // Find the maximum number of the unsorted array
            int maxIndex = boundary;
            for (int unsortedIndex = boundary; unsortedIndex < this.data.length; unsortedIndex++) {
                // Find the index of the maximum number
                if (this.data[unsortedIndex] > this.data[maxIndex]) {
                    // Swap the index of found maximum number with the index of assumed maximum number
                    maxIndex = unsortedIndex;
                }

            }
            // Swap the found maximum number with boundary number
            int temp;
            temp = this.data[maxIndex];
            this.data[maxIndex] = this.data[boundary];
            this.data[boundary] = temp;
        }
    }


}
















