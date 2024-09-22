package CA224;

public class Main {
    public static void main(String[] args) {
        //create object from Circle
//        Circle myCircle = new Circle(3);
//        System.out.println("radius: " + myCircle.radius);
//        System.out.println("Area : "  + myCircle.getArea());
//
//        System.out.println(myCircle.toString());

//        TV just = new TV();
//        just.powerOn();
//        just.channelUp();
//        just.channelUp();
//        just.channelUp();
//        just.channelDown();
//        just.setChannel(10);
//        just.volumeUp();
//        System.out.println("channel: " + just.channel);
//        System.out.println("volume: " + just.volume);

        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "farah";
        student2 = student1;

        student2.name = "mohamed";

        System.out.println("Student 1 Name : " + student1.name);
        System.out.println("Student 2 Name : " + student2.name);
//        System.out.println("AGE : " + student1.age);
//        System.out.println("Score : " + student1.score);
//        System.out.println("status : " + student1.status);
//        System.out.println("gender : " + student1.gender);

        int i = 1;
        int j = 2;

        i = j ;
         j = 20;
        System.out.println("i: " + i);
        System.out.println("j : " + j);
    }
}
