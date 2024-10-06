package CA221;

public class ThisDemo {
    int  age ;   //this.
    String name , address;
    static int marks; ///className.

    public ThisDemo(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    ThisDemo(){
//         age=25;
//         address = "howlwadaag";
//         name= "osman ali";
        this(25 , "osman ali","Howlwadaag");
    }

    public void setAge(int age) {
        this.age = age; //instance
    }

    public static void setMarks(int marks) {
        ThisDemo.marks = marks;  //static
    }
}
