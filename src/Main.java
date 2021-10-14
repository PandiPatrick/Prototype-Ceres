import java.io.*;
import java.util.*;
import java.lang.*;

import javax.json.*;
import javax.json.stream.JsonParser;

import Classes.Actions.GameManager;
import Classes.Character.Character;


public class Main {
    public static void main(String[] args) {
        Character player = new Character("SoundTap");
        GameManager gm = new GameManager();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Testing Area
        //Current Project - Figure out .json files



        try {
            InputStream fis = new FileInputStream("posts.json");
            JsonReader jsonReader = Json.createReader(fis);
            JsonObject jsonObject = jsonReader.readObject();
            jsonReader.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("No file found");
        }

        String jsonString =  "{\r\n   \"firstName\": \"John\", \"lastName\": \"Smith\", \"age\": 25,\r\n   \"phoneNumber\": [\r\n       { \"type\": \"home\", \"number\": \"212 555-1234\" },\r\n       { \"type\": \"fax\", \"number\": \"646 555-4567\" }\r\n    ]\r\n }";
        JsonParser parser = Json.createParser(new StringReader(jsonString));

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
















        // Main Code
        while(true) {
            gm.wait(150);
            System.out.println("Select Action: \n1.Collect Bush \n2.Skin Animal \n3.Chug a potion \n4.Display Character Info\n");
            int option = in.nextInt();

            if (option == 1) {
                int random = rand.nextInt(2);
                if (random == 1) {
                    player.Harvesting.addXP(5);
                } else {
                    player.Health.addValue(-2);
                    gm.checkIfDead(player.Health.getValue());
                }
            }
            else if (option == 2) {
                player.Skinning.addXP(20);
            }
            else if (option == 3) {
                player.Health.addValue(30);
                System.out.println("Gained 30 HP");
            }
            else if (option == 4) {
                System.out.println("Name : Health : Mana");
                System.out.println(player.getName() + " : " + player.Health.getValue() + " : " + player.Mana.getValue());
            }
            else if (option == 666) {
                player.Health.setValue(0);
                gm.checkIfDead(player.Health.getValue());
            }
            else System.exit(0);

        }








    }
}
