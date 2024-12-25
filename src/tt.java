public class tt {
    public static void main(String[] args) {
        printNumbers1(5);
    }
    static void printNumbers1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNumbers2(n - 1);
    }
    static void printNumbers2(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNumbers1(n - 1);
    }

}
