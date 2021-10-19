import java.util.Random;
import java.util.Scanner;

public class SecondThread extends Thread{
    private Random rnd;
    Scanner in = new Scanner(System.in);

    public SecondThread(){
        this.rnd = new Random();
        this.setName("SecondThread");
        this.setDaemon(true);
    }


    @Override
    public void run() {
        while (true){
            System.out.println(this.getName() + " " + rnd.nextInt(100));
            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
