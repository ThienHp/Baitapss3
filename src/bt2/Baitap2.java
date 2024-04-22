package bt2;

public class Baitap2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try{
            sumThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The sum is: " + sumThread.getSum());
    }
}
