public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int lower = 1, upper = 20;
        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int j = 2; j <= Math.sqrt(n); j++)
            if (n % j == 0)
                return false;
        return true;
    }
}
