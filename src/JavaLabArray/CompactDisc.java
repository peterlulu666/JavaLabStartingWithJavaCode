package JavaLabArray;

//This program creates a list of songs for a CD by reading from a file

import java.io.*;

public class CompactDisc {
    public static void main(String[] args) throws IOException {
        // This is relative paths.
        // You would also use absolute paths.
        FileReader file = new FileReader("src/JavaLabArray/Classics.txt");
        BufferedReader input = new BufferedReader(file);
        String title;
        String artist;

        //Declare an array of songs, called cd, of size 6.
        Song [] cd = new Song[6];

        for (int i = 0; i < cd.length; i++) {
            title = input.readLine();
            artist = input.readLine();
            // fill the array by creating a new song with
            // the title and artist and storing it in the
            // appropriate position in the array.
            Song song = new Song(title, artist);
            cd[i] = song;
        }

        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            //print the contents of the array to the console.
            System.out.println(cd[i]);
        }
    }
}


