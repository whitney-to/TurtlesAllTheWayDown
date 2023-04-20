public class Factorial {
    public static Integer factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
