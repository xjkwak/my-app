package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sumar(3, 7));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int[] primes(int n) {
        int res[] = new int[n];

        for (int i = 0; i < res.length; i++) {
            res[i] = generatePrime(i+1);
        }

        return res;
    }

    public static int generatePrime(int num) {

        int prime = 2;
        int cont = 0;

        if (num > 1)
        {
            while (cont < num) {
                if (isPrime(prime)) {
                    cont++;
                }
                prime++;
            }
        }


        return prime;
    }

    public static boolean isPrime(int num) {

        int c = 0;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                c++;
            }
        }

        return c == 0;
    }
}
