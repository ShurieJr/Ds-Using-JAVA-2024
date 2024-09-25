package CA221.P2;

import CA221.P1.C1;
public class C3 {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.x = 10;  // public
        //obj.y = 2;  // cannot access default
        //obj.z = 1;  // cannot access private

        obj.setZ(5);
    }
}
