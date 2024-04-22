package bt8;

public class Baitap8 {
    public static void main(String[] args) {
        SharedVariable sharedVariable = new SharedVariable();
        IncrementThread incrementThread = new IncrementThread(sharedVariable);
        DecrementThread decrementThread = new DecrementThread(sharedVariable);
        incrementThread.start();
        decrementThread.start();
    }
}
