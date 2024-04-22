package bt10;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHÂP THƠI GIAN CÂN CHAY:");
        int sleepTime = scanner.nextInt();
        SleepThread sleepThread = new SleepThread(sleepTime);
        sleepThread.start();
    }
}