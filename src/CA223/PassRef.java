package CA223;

public class PassRef {
    private int age;
    public int marks;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1)
            this.age = age;
        else
            System.out.println("Invalid age! >=1 ");
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
