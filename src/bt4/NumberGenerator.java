package bt4;

public class NumberGenerator implements Runnable  {

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Number :" + i + "HashCode : " + this.hashCode());
        }
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
