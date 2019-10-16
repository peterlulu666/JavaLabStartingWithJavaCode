package JavaLabClass;

public class Television {
    // The manufacturer attribute will hold the brand name.
    // This cannot change once the television is created, so will be a named constant.
    final String MANUFACTURER;
    // The screenSize attribute will hold the size of the television screen.
    // This cannot change once the television has been created so will be a named constant.
    final int SCREEN_SIZE;
    // The powerOn attribute will hold the value true if the power is on, and false if the power is off.
    boolean powerOn;
    // The channel attribute will hold the value of the station that the television is showing.
    int channel;
    // The volume attribute will hold a number value representing the loudness.
    int volume;

    // Create a constructor definition that has two parameters, a manufacturer’s brand and a screen size.
    // These parameters will bring in information.
    public Television(String MANUFACTURER, int SCREEN_SIZE) {
        // Inside the constructor, assign the values taken in from the parameters to the corresponding fields.
        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
        // Initialize the powerOn field to false (power is off), the volume to 20, and the channel to 2.
        powerOn = false;
        volume = 20;
        channel = 2;

    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;

    }

    // Define a mutator method called power that
    // changes the state from true to false or from false to true.
    // This can be accomplished by using the NOT operator (!).
    // If the boolean variable powerOn is true, then !powerOn is false and vice versa.
    public void power() {
        powerOn = !powerOn;
    }

    // Define two mutator methods to change the volume.
    // One method should be called increaseVolume and will increase the volume by 1.
    // The other method should be called decreaseVolume and will decrease the volume by 1.
    public void increaseVolume() {
        this.volume = this.volume + 1;

    }

    public void decreaseVolume() {
        this.volume = this.volume - 1;

    }


}
