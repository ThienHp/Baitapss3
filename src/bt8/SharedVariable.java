package bt8;

class SharedVariable {
    private int value;
    public synchronized void increment() {
        value++;
        System.out.println("Incremented value: " + value);
    }
    public synchronized void decrement() {
        value--;
        System.out.println("Decremented value: " + value);
    }
}
