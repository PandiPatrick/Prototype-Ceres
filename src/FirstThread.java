import java.util.Random;
import java.util.Scanner;

public class FirstThread extends Thread{
    private Random rnd;
    Scanner sc = new Scanner(System.in);

    public FirstThread(){
        this.rnd = new Random();
        this.setName("FirstThread");
        this.setDaemon(true);
    }


    @Override
    public void run() {
        while (true){
            if (sc.nextInt() == 1) {
                System.out.println("Hello");
            }


        }
    }
}

