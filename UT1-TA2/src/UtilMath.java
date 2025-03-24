public class UtilMath {
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(long num) {
        boolean prime = true;
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        long i = 3;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                prime = false;
                break;
            }
            i += 2;
        }
        return prime;
    }
}
