package Classes.Actions;
import java.lang.*;
import Classes.Character.Character;

public class GameManager {
    public void GameOverConsole(int frametime){

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\n\n\n\n\nG\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M E\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M E  O\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M E  O V\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M E  O V E\n\n\n\n\n");
        wait(frametime);
        System.out.print("\n\n\n\n\nG A M E  O V E R\n\n\n\n\n");
        wait(frametime);
        System.exit(0);
    }
    // Wait method to pause commands
    public void wait(int time){
        try {
            Thread.sleep(time);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void checkIfDead(double HP)
    {
        if ( HP <= 0 ) GameOverConsole(250);
    }

}
