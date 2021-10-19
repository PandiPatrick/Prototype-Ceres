import Classes.Actions.GameManager;
import Classes.Character.Character;

import java.util.Random;


public class Actions {
    Character player = new Character("SoundTap");
    GameManager gm = new GameManager();
    Random rand = new Random();





    public void CollectBush(){
        int random = rand.nextInt(2);
        if (random == 1) {
            player.Harvesting.addXP(5);
            System.out.println("+5 Harvesting XP");
        } else {
            player.Health.addValue(-2);
            gm.checkIfDead(player.Health.getValue());
            System.out.println("-2 HP");
        }
    }

    public void SkinAnimal(){
        player.Skinning.addXP(20);
        System.out.println("+20 Skinning XP");
    }

    public void ChugPotion(){
        player.Health.addValue(30);
        System.out.println("Gained 30 HP");
    }

    public void DisplayStats(){
        System.out.println("Name : Health : Mana");
        System.out.println(player.getName() + " : " + player.Health.getValue() + " : " + player.Mana.getValue());

    }

    public void KILLPLAYER(){
        player.Health.setValue(0);
        gm.checkIfDead(player.Health.getValue());
    }



}
