public class CountPrimes {
        public static int countPrimes(int n) {
            int count = 0;
            boolean[] prime = new boolean[n];

            for (int i = 2; i < n; i++) {
                prime[i] = true;
            }

            for (int i = 2; i < n; i++) {
                if (prime[i]) {
                    for (long j = (long) i * i; j < n; j += i) {
                        prime[(int) j] = false;
                    }
                }
            }
            for (int i = 2; i < n; i++) {
                if (prime[i]) {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            int n=10;
            System.out.println("No of Primes: "+countPrimes(n));
        }
}
