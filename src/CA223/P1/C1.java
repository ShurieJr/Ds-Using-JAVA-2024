package CA223.P1;

public class C1 {
    public int x;
    int y;
    private int z;

    public C1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void m1 (){    }
     void m2 (){    }
    private void m3 (){    }

    //get || set

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void initializeZ(int z) {
        this.z = z;
    }

    // toString()

    @Override
    public String toString() {
        return "C1:\n" +
                "x=" + x +
                "\n y=" + y +
                "\n z=" + z ;
    }

}
