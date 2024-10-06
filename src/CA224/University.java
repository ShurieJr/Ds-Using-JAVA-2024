package CA224;

public class University {
    public String name;
    int year;
    private int numberOfEmp;

    public University(String name, int numberOfEmp, int year) {
        this.name = name;
        this.numberOfEmp = numberOfEmp;
        this.year = year;
    }

    University() {
//        name = "Jamhuriya univ";
//        numberOfEmp = 400;
//        year = 2010;
        this("Jamhuriya univ", 400 , 2010);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmp() {
        return numberOfEmp;
    }

    public void setNumberOfEmp(int numberOfEmp) {
        this.numberOfEmp = numberOfEmp;
    }

    void test(){
        String name;  //local variable
        System.out.println(this.name);
    }
}
