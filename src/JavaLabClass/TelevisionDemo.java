package JavaLabClass;

import java.util.Scanner;

public class TelevisionDemo {
    public static void main(String[] args) {
        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int station;    //the user's channel choice

        //declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);

        //turn the power on
        bigScreen.power();
        //display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + " inch " +
                bigScreen.getManufacturer() + " has been turned on.");
        //prompt the user for input and store into station
        System.out.print("What channel do you want?  ");
        station = keyboard.nextInt();

        //change the channel on the television
        bigScreen.setChannel(station);
        //increase the volume of the television
        bigScreen.increaseVolume();
        //display the the current channel and volume of the television
        System.out.println("Channel:  " + bigScreen.getChannel() +
                "   Volume:  " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        //decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        //display the current channel and volume of the television
        System.out.println("Channel:  " + bigScreen.getChannel() +
                "   Volume:  " + bigScreen.getVolume());
        System.out.println();    //for a blank line


        // HERE IS WHERE YOU DO TASK #5
        // Declare another Television object called portable.
        // Instantiate portable to be a Sharp 19 inch television.
        var portable = new Television("Sharp", 19);
        // Use a call to the power method to turn the power on.
        portable.power();
        // Use calls to the accessor methods to print what television was turned on.
        // Display the the current channel and volume of the television.
        System.out.println("A " + portable.getScreenSize() + " inch " +
                portable.getManufacturer() + " has been turned on.");
        // Prompt the user for input and store into station.
        System.out.print("What channel do you want?  ");
        station = keyboard.nextInt();
        // Use calls to the mutator methods to change the channel to the user’s preference and decrease the volume by two.
        // Change the channel on the television.
        portable.setChannel(station);
        // decrease the volume of the television.
        portable.decreaseVolume();
        // decrease the volume of the television.
        portable.decreaseVolume();
        // Use calls to the accessor methods to print the changed state of the portable.
        // Display the current channel and volume of the television.
        System.out.println("Channel:  " + portable.getChannel() +
                "   Volume:  " + portable.getVolume());
        // For a blank line.
        System.out.println();

    }
}
