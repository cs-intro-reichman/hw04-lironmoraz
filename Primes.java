public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int p = 2;
        while (p <= Math.sqrt(n)) {

            for (int i = p + 1; i < n + 1; i++) {
                if (i % p == 0) {
                    isPrime[i] = false;
                }
            }
            p++;
            while (!isPrime[p] && p <= Math.sqrt(n)) {
                p++;
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                counter++;
            }
        }
        int percent = (int) (((double) (counter) / n) * 100);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}


