package bt6;

class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("Optimized: " + num);
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
