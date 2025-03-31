import java.util.Scanner;

class SuperFibonacci {
    static final long MOD = 1000000; // Last six digits

    public static long fastSuperFibonacci(long N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        long a = 1, b = 2;
        long b00 = a, b01 = b, b10 = 1, b11 = 0;
        long p00 = 1, p01 = 0, p10 = 0, p11 = 1;
        long e = N - 1;

        while (e != 0) {
            if (e % 2 == 0) {
                long newB10 = (b10 * b00 + b11 * b10) % MOD;
                long newB11 = (b10 * b01 + b11 * b11) % MOD;
                b10 = newB10;
                b11 = newB11;
                e /= 2;
            } else {
                long newP10 = (p10 * b00 + p11 * b10) % MOD;
                long newP11 = (p10 * b01 + p11 * b11) % MOD;
                p10 = newP10;
                p11 = newP11;
                e -= 1;
            }
        }
        return p10; // The lower-left value in the matrix gives SF(N)
    }

    public static void main(String[] args) {
        long N;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            N = scanner.nextLong();
        }

        long result = fastSuperFibonacci(N);
        System.out.println("The last six digits of SF(" + N + ") are " + result);
    }
}
