package bt10;

public class SleepThread extends Thread{
    private final int sleepTime;
    public SleepThread (int sleepTime){
        this.sleepTime = sleepTime;

    }

    @Override
    public void run() {
        try{
            System.out.println("THỜI GIAN ĐƠI LÀ  " + sleepTime + " S.");
            Thread.sleep(sleepTime *1000);
            System.out.println("ĐÃ CHAY ĐƯỢC  " + sleepTime + " S.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
