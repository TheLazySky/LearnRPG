import character.*;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class LinkStart{
    static int x;
    Player player1;
    Player player2;



    public static void main(String[] args){
        LinkStart game = new LinkStart();

        game.Welcome();
        game.characterSetup();
        game.saveGame();
        game.readChar();

    }

    public void Welcome(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome back to LearnRPG");
            System.out.println("Create new Character(1), Continue from Save(2)");
            x=sc.nextInt();
            if(x==1){}
            if(x==2){}
            else {
            }
        }

    public void characterSetup(){
        if(x==1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Let's make a character. Select a Race.");
            System.out.println("1, 2, 3, 4, 5, 6");
            String rac = input.next();
            System.out.println("Nice, now what class would ya like?");
            System.out.println("1, 2, 3, 4, 5, 6");
            String claz = input.next();
            System.out.print("Finally, what's your name: ");
            String nam = input.next();

            switch (rac) {
                case "1":
                    aHuman a = new aHuman();
                    a.setRace("Human");
                    a.setName(nam);
                    player1 = a;


                default:
                    System.out.println("invalid input");
                    break;
            }


            //System.out.println("Info: " + player1.getRace()); //Tests Data Passing
        }else {
            System.out.println("welcome back"); //insert methods for reloading save data
            player1 = new Player();

        }
        System.out.println("Hello");
    }

    public void saveGame() {
        System.out.println();
    }

    public void readChar(){
        System.out.println("Now we'll read your character: ");
        System.out.println("Name: "+player1.getName());
    }
}
