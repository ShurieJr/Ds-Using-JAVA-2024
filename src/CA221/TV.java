package CA221;
public class TV {
    //Variables
    int channel;
    int volume;
    boolean status;
    //constructor
    TV (){
        status = false;
        volume = 0;
        channel = 1;
    }
    // Methods
    public void setChannel(int newChannel) {
        channel = newChannel;
    }
    //channel up
    void channelUp(){
        if(status == true)
        {
            if(channel < 120) {
                channel++;
            }
            else{
                channel = 1;
            }
        }
        else{
            System.out.println("Oops! power on the TV!");
        }
    }
    //channel down
    void channelDown(){
        channel--;
    }
    //turn on
    void turnOn(){
        status = true;
    }
    //turn off
    void turnOff(){
        status = false;
    }


    //main method
    public static void main(String[] args) {
        TV superSport  = new TV();
        superSport.turnOn();
        superSport.channelUp();  //2
        superSport.channelUp();   //3
        superSport.channelUp();  //4
        superSport.setChannel(500); //
        superSport.channelUp();   //1
        System.out.println("Channel : " + superSport.channel);
    }
}
