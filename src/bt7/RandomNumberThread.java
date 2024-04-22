package bt7;

public class RandomNumberThread extends Thread{
    @Override
    public void run() {
        int randomNumber = (int) (Math.random() *100);
        System.out.println("Random Number:" + randomNumber);
    }
}
