package CA223;

public class University {
    //variables
    int uniCode;
    String universityName, address;
    int numberOfStudents;

    public University(int uniCode, String universityName,
                      String address, int numberOfStudents) {
        this.uniCode = uniCode;
        this.universityName = universityName;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
    }

    University(){
//        uniCode = 000;
//        universityName = "JUST";
//        address = "Howlwadaag";
//        numberOfStudents = 10000;
        this(000,"JUST",
                "Howlwadaag", 10000);
    }

    @Override
    public String toString() {
        return "University: \n" +
                "uniCode=" + this.uniCode +
                "\nuniversityName='" + universityName + '\'' +
                "\naddress='" + address + '\'' +
                "\n numberOfStudents=" + numberOfStudents ;
    }

    //main method
    public static void main(String[] args) {
        University just = new University();
        System.out.println(just.toString());

    }
}
