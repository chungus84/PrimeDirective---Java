import java.util.ArrayList;
public class PrimeDirective {
    /** class which returns prime numbers */

    public boolean isPrime(int number) {
        /** checks the given number to see if its prime (true) or not (false) */
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        /** takes an array and returns an ArrayList of prime numbers */
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if(isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.onlyPrimes(numbers));

    }
}
