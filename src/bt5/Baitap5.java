package bt5;

public class Baitap5 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        oddThread.start();
        try{
            oddThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        evenThread.start();
    }
}
