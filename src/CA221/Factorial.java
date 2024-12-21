package CA221;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("factorail(4): " + factorial(4));
        System.out.println("factorailLoop(4): " + factorialLoop(4));
        int marks[] = {10, 20, 30, 40};
        System.out.println("linearsum(): " + linearSum(marks, marks.length - 1));

        System.out.println("power(2,5): " + power(2, 5));
        System.out.println("fib(0): " + fibonacci(0));
        System.out.println("fib(1): " + fibonacci(1));
        System.out.println("fib(2): " + fibonacci(2));
        System.out.println("fib(3): " + fibonacci(3));
        System.out.println("fib(4): " + fibonacci(4));
    }

    //1. factorial
    static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }

    static int factorialLoop(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // 2. sum N - 1
    static int sum(int num) {
        if (num == 1)
            return 1; // base case
        else
            return num + sum(num - 1); // recursive call
    }

    //3. linear sum
    static int linearSum(int data[], int index) {
        if (index == 0)
            return data[index];
        else
            return data[index] + linearSum(data, index - 1);
    }

    //4. power
    static int power(int x, int n) {
        int result;
        if (n == 0)
            result = 1;
        else
            result = x * power(x, n - 1);
        return result;
    }

    //4. fibonacci series  / 0 , 1
    static int fibonacci(int number) {
        if (number <= 1)
            return number;
        else
            return fibonacci(number - 2) + fibonacci(number - 1);
    }
}