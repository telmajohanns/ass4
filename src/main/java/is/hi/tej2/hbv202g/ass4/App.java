package is.hi.tej2.hbv202g.ass4;

import org.apache.commons.numbers.primes.Primes;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int prime = 123456789;
        int next = Primes.nextPrime(prime);
        System.out.println(next);
    }
}
