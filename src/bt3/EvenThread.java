package bt3;

public class EvenThread extends  Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 ==0){
                System.out.println("Even:" + i);
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
