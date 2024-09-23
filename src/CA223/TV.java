package CA223;

public class TV {
    //variables
    int channel, volume;
    boolean status;

    //constructors
    TV() {
        channel = 1;
        volume = 0;
        status = false;
    }

    //methods
    //1. Turn On
    void turnOn() {
        if (status == false)
            status = true;
        else
            System.out.println("Error: Tv is already turned on");
    }

    //2. turn off
    void turnOff() {
        if (status == true)
            status = false;
        else
            System.out.println("Error: Tv is already turned off");
    }

    //3. setchannel
    void setChannel(int newChannel) {
        if (status == true) {
            if (newChannel >= 1 && newChannel <= 120)
                channel = newChannel;
            else
                System.out.println("Error: Channel is not available! [1-120]");
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //4. channel up
    void channelUp() {
        if (status) {
            if (channel < 120)
                channel++;
            else
                channel = 1;
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //5. channel down
    void channelDown() {
        if (status) {
            if (channel > 1)
                channel--;
            else
                channel = 120;
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //6. volumeup
    void volumeUp() {
        if (status) {
            if (volume < 7)
                volume++;
            else
                System.out.println("Error: you reached the limit [7 maximum amount] ");
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //7. volumedown
    void volumedown() {
        if (status) {
            if (volume > 0)
                volume--;
            else
                System.out.println("Error: you reached the limit [0 minimum amount] ");
        } else
            System.out.println("Error: Turn on your tv!");
    }

    int tempVolume;

    //mute
    void mute() {
        if (status) {
            tempVolume = volume;
            volume = 0;
            System.out.println("Muted!");
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //unmute
    void unMute() {
        if (status) {
            volume = tempVolume;
            System.out.println("UnMuted!");
        } else
            System.out.println("Error: Turn on your tv!");
    }

    //main
    public static void main(String[] args) {
        TV just = new TV();
        just.turnOn();
        just.channelUp();
        just.setChannel(4);
        just.volumeUp();
        just.volumeUp();
        System.out.println("volume: " + just.volume);
        System.out.println("Channel:  " + just.channel);
        just.mute();
        System.out.println("volume after mute : "+ just.volume);
        just.unMute();
        System.out.println("volume after unMute: " + just.volume);

    }
}
