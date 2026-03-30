public class SievePrimes {

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all are prime
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // Step 3: Mark multiples
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Count primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println(countPrimes(n)); // Output: 10
    }
}