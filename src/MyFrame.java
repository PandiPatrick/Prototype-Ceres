import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import Classes.Character.Character;
import Classes.Actions.GameManager;

public class MyFrame extends JFrame implements ActionListener {

    JButton CollectBush;
    JButton SkinAnimal;
    JButton ChugPotion;
    JButton DisplayStats;
    JButton KILLPLAYER;
    JLabel label;



    Actions action = new Actions();

    MyFrame(){

        label = new JLabel();
        label.setText("Test");
        label.setBounds(350, 250, 100, 100);



        CollectBush = new JButton();
        CollectBush.setBounds(50, 50, 250, 50);
        CollectBush.addActionListener(this);
        CollectBush.setText("Collect Bush");

        SkinAnimal = new JButton();
        SkinAnimal.setBounds(50, 125, 250, 50);
        SkinAnimal.addActionListener(this);
        SkinAnimal.setText("Skin Animal");

        ChugPotion = new JButton();
        ChugPotion.setBounds(50, 200, 250, 50);
        ChugPotion.addActionListener(this);
        ChugPotion.setText("Chug Potion");

        DisplayStats = new JButton();
        DisplayStats.setBounds(50, 275, 250, 50);
        DisplayStats.addActionListener(this);
        DisplayStats.setText("Display Player Stats");

        KILLPLAYER = new JButton();
        KILLPLAYER.setBounds(0, 0, 10, 10);
        KILLPLAYER.addActionListener(this);
        KILLPLAYER.setOpaque(false);
        KILLPLAYER.setContentAreaFilled(false);
        KILLPLAYER.setBorderPainted(false);


        
        this.setTitle("Prototype Ceres"); // Name of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X
        this.setLayout(null);
        this.setResizable(false); //prevent frame from being resized
        this.setSize(500, 500); // sets x & y dimensions
        this.setVisible(true); // make this visible
        this.add(CollectBush);
        this.add(SkinAnimal);
        this.add(ChugPotion);
        this.add(DisplayStats);
        this.add(KILLPLAYER);


        ImageIcon image = new ImageIcon("Logo.jpg"); //Creates an ImageIcon
        this.setIconImage(image.getImage()); //change icon of the frame
        this.getContentPane().setBackground(new Color(200,255,200)); // Background Color

        




    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==CollectBush) {
            action.CollectBush();
        }
        if (e.getSource()==SkinAnimal) {
            action.SkinAnimal();
        }
        if (e.getSource()==ChugPotion) {
            action.ChugPotion();
        }
        if (e.getSource()==DisplayStats) {
            action.DisplayStats();
        }
        if (e.getSource()==KILLPLAYER) {
            action.KILLPLAYER();
        }
    }
}
