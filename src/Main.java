import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import java.lang.*;

import javax.imageio.ImageIO;
import javax.json.*;
import javax.json.stream.JsonParser;
import javax.swing.*;

import Classes.Actions.GameManager;
import Classes.Character.Character;







public class Main {
    public static void main(String[] args) {

        if (args[0].equals("ThreadTest")){
            FirstThread firstThread = new FirstThread();
            SecondThread secondThread = new SecondThread();
            firstThread.start();
            secondThread.start();

            while(true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (System.in.equals("stop")){

        }

        else if (args[0].equals("RPGTest")) {
            Character player = new Character("SoundTap");
            GameManager gm = new GameManager();
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            //Testing Area
            //Current Project - Figure out .json files
            //                - Figure out GUI


            MyFrame myFrame = new MyFrame();








/*
            try {
                InputStream fis = new FileInputStream("items.json");
                String items = fis.toString();
                fis.close();
                JsonParser parser = Json.createParser(new StringReader(items));
                JsonParser.Event e;
                while(parser.hasNext())
                {
                    e = parser.next();
                    if (e.equals(JsonParser.Event.START_OBJECT))
                    {
                        continue;
                    }
                    if (e.equals(JsonParser.Event.KEY_NAME) ||
                            e.equals(JsonParser.Event.VALUE_STRING))
                    {
                        System.out.println(parser.getString());
                    }
                }

            } catch (Exception e) {
                System.out.println("No file found");
            }


 */


        } }
}
