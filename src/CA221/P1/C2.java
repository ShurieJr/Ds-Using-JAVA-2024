package CA221.P1;

public class C2 {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.x = 7;  // public
        obj.y = 8 ; //default
        obj.setZ(55);
        obj.getZ();
        //obj.z ; //private
    }
}
