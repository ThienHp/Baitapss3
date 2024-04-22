package bt6;

class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("Lazy: " + num);
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}