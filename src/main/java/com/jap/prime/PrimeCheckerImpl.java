package com.jap.prime;

public class PrimeCheckerImpl {
    public static void main(String[] args) {
        PrimeCheckerImpl primeChecker = new PrimeCheckerImpl();
        System.out.println("primeChecker.primeNumberCheck(7) = " + primeChecker.primeNumberCheck(2));
    }

    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not

        PrimeChecker primeChecker = number1 -> {
            int count = 0;
            if (number == 0) {
                return false;
            } else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0)
                        count++;
                }
                if (count == 2)
                    return true;
                else
                    return false;
            }
        };
        return primeChecker.isPrimeNumber(number);
    }
}
