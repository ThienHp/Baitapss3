package Bt9;

public class CountdownThread extends  Thread{
    @Override
    public void run() {
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
