package JavaLabString;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SecretString {
    public static void main(String[] args) throws IOException {
        int count = 0;
        String display = "";
        // Read the file secret.txt
        // This is relative paths.
        // You would also use absolute paths.
        FileReader file = new FileReader("src/JavaLabString/secret.txt");
        Scanner input = new Scanner(file);
        String sentence = input.nextLine();
        StringTokenizer tokens = new StringTokenizer(sentence);
        // You should process the tokens by taking
        // the first letter of every fifth word, starting with the first word in the file.
        // These letters should converted to capitals,
        // then be appended to a StringBuffer object to
        // form a word which will be printed to the console to display the secret message.
        while (tokens.hasMoreTokens()) {
            sentence = tokens.nextToken();
            sentence = sentence.toUpperCase();
            if (count % 5 == 0) {
                display += sentence.charAt(0);
            }

            count++;
        }

        System.out.println("Secret: " + display);


    }
}
