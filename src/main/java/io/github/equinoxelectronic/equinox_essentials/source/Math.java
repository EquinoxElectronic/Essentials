package io.github.equinoxelectronic.equinox_essentials.source;

public class Math {
    public double clampNum(double x, double y, double input) {
        return java.lang.Math.min(java.lang.Math.max(input, x), y);
    }

    public double average(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= java.lang.Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return java.lang.Math.abs(a * b) / gcd(a, b);
    }

    public double power(double base, int exponent) {
        if (exponent < 0) {
            return 1.0 / power(base, -exponent);
        }
        if (exponent == 0) return 1;
        if (exponent == 1) return base;

        double half = power(base, exponent / 2);
        return half * half * (exponent % 2 == 0 ? 1 : base);
    }
}
