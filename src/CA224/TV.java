package CA224;

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

    //Methods

    void setChannel(int newChannel) {
        if(status ){
            if(newChannel > 0 && newChannel < 101)
                channel = newChannel;
            else
                System.out.println("Channel is not available!");
        }
        else
            System.out.println("Turn on your tv!");

    }
    void channelUp(){
        if(status){
            if(channel < 100)
                channel++;
            else
                channel = 1;
        }
        else
            System.out.println("Error! Turn on your TV!");
    }
    void channelDown(){
        if(status){
            if(channel > 1)
                channel--;
            else
                channel = 100;
        }
        else
            System.out.println("Error! Turn on your TV!");
    }
    void powerOn(){
        if(status == false)
            status = true;
        else
            System.out.println("Error! Tv already turned on!");
    }
    void powerOff(){
        if(status == true)
            status = false;
        else
            System.out.println("Error! Tv already turned off!");
    }
    void volumeUp(){
        if(status == true){
            if(volume < 7)
                volume++;
             else
                System.out.println("reached maximum volume!");
        }
        else
            System.out.println("Error! Turn on your TV!");
    }

    void volumeDown(){
        if(status == true)
        {
            if(volume > 0)
                volume--;
            else
                System.out.println("reached minimum volume!");
        }
        else
            System.out.println("Error! Turn on your TV!");
    }
}
