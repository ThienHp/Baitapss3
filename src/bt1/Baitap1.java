package bt1;

public class Baitap1 extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 10; i >= 0; i--) {
                System.out.println("Chủ đề sẽ ngủ trong giây " + i +"s");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Chủ đề bị gián đoạn.");

        }


    }

    public static void main(String[] args) {
        Baitap1 baitap1 = new Baitap1();
        Baitap1 baitap11 = new Baitap1();
        baitap1.start();
        baitap11.start();
        try {
            baitap1.join();
            baitap11.join();

        }catch (InterruptedException e){
            System.out.println("Chủ đề chính bị gián đoạn.");
        }
        System.out.println("Chủ đề chính thoát ra.");
    }
}
