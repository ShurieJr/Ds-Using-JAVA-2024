package CA224.Package1;
public class C1 {
    public int age;
    int marks;
    private int code;

    public C1() {
    }

    public C1(int code, int marks, int age) {
        this.code = code;
        this.marks = marks;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
