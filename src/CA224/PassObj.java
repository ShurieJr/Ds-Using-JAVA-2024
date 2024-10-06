package CA224;

public class PassObj {
    public static void main(String[] args) {
        University obj1 = new University();
        University obj2 = new University("JUST",
                200,2012);
    //method calling
        display(obj1);
    }

    static void display( University obj2) {

        System.out.println("University name: " + obj2.getName());
        System.out.println("University year: " + obj2.getYear());
        System.out.println("University employee: " + obj2.getNumberOfEmp());
    }
}
