package JavaLabWhileLoop;

// This class simulates rolling a pair of dice 10,000 times and
// counts the number of times doubles of are rolled for each different
// pair of doubles.

public class DiceSimulation {
    public static void main(String[] args) {
        // You will be modifying the DiceSimulation class only.
        // I have declared all the variables.
        // You need to add what the method does.
        final int NUMBER = 10000;    //the number of times to roll the dice

        Dice die1 = new Dice(); // the first die
        Dice die2 = new Dice(); // the second die
        int die1Value;        // number of spots on the first die
        int die2Value;        // number of spots on the second die
        int count = 0;            // number of times the dice were rolled
        int snakeEyes = 0;    // number of times snake eyes is rolled
        int twos = 0;            // number of times double two is rolled
        int threes = 0;            // number of times double three is rolled
        int fours = 0;            // number of times double four is rolled
        int fives = 0;            // number of times double five is rolled
        int sixes = 0;            // number of times double six is rolled

        //ENTER YOUR CODE FOR THE ALGORITHM HERE
        // You will be using several control structures:
        // a while loop and an if-else-if statement nested inside another if statement.
        while (true) {
            // Roll the first die
            die1.roll();
            // Get the value of the first die
            // Store the value to the die1Value
            die1Value = die1.getSpots();
            // Roll the second die
            die2.roll();
            // Get the value of the second die
            // Store the value to the die2Value
            die2Value = die2.getSpots();
            // If the value of the first die is the same as the value of the second die.
            if (die1Value == die2Value) {
                // If value of first die is 1
                if (die1Value == 1) {
                    // Increment the number of times snake eyes were rolled.
                    snakeEyes += 1;

                } else if (die1Value == 2) {
                    // If value of first die is 2
                    // Increment the number of times twos were rolled.
                    twos += 1;

                } else if (die1Value == 3) {
                    // If value of first die is 3
                    // Increment the number of times threes were rolled.
                    threes += 1;

                } else if (die1Value == 4) {
                    // If value of first die is 4
                    // Increment the number of times fours were rolled.
                    fours += 1;

                } else if (die1Value == 5) {
                    // If value of first die is 5
                    // Increment the number of times fives were rolled.
                    fives += 1;

                } else if (die1Value == 6) {
                    // If value of first die is 6
                    // Increment the number of times sixes were rolled.
                    sixes += 1;


                }

            }


            // Increment the number of times the dice were rolled.
            count += 1;

            // Repeat while the number of dice rolls are less than
            // the number of times the dice should be rolled.
            if (count >= NUMBER) {
                break;

            }

        }

        System.out.println("You rolled snake eyes " + snakeEyes +
                " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos +
                " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes +
                " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours +
                " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives +
                " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes +
                " out of " + count + " rolls.");
    }
}


