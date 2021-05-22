import character.*;
import enemy.Basic;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class LinkStart{
    static int x;
    Player player1;
    Player player2;
    Basic En;



    public static void main(String[] args){
        LinkStart game = new LinkStart();

        game.Welcome();
        game.characterSetup();
        game.saveGame();
        game.readChar();
        game.enemySetup();
        game.battle();

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
        System.out.println("Attack:"+player1.getAttack());
    }

    public void enemySetup(){
        Random enemy = new Random();
        Basic enemy1 = new Basic(0,0,0,0);
        enemy1.setAttack(enemy.nextInt(6)+2);
        enemy1.setHealth(enemy.nextInt(20)+60);
        enemy1.setDefense(enemy.nextInt(5));
        enemy1.setMana(enemy.nextInt(100));
        En=enemy1;
    }


    public void battle(){
        Scanner sc = new Scanner(System.in);
        Random re = new Random();
        Random buff= new Random();
        double hBuff=0;
        double atBuff=0;
        double defBuff=0;
        while(player1.getHealth()>0 && En.getHealth()>0){
            System.out.println("Buffs: " + atBuff);
            System.out.println("Player Health: "+player1.getHealth());
            System.out.println("Enemy Health: "+En.getHealth());
            System.out.println("Attack(1) or Defend(2)");
            int x = sc.nextInt();

            double w=(En.getAttack()*(re.nextInt(3)*.1+.8))-((player1.getDefense()+defBuff)*(re.nextInt(8)*.1+1.2)); //Damage dealt to player by defending
            if(w<0){
                w=0;
            }
            double y=(En.getAttack()-(player1.getDefense()+defBuff)*(re.nextInt(3)*.1+.8)); //Damage dealt to player
            if(y<0){
                y=0;
            }
            double z=((player1.getAttack()+atBuff)-En.getDefense()*(re.nextInt(3)*.1+.8)); // damage dealt to enemy
            if(z<0){
                z=0;
            }

                if(x==1){
                    System.out.println("You Strike your enemy. They take "+z+" damage!");
                    System.out.println("Your enemy strikes, you take "+y);
                    En.setHealth(En.getHealth()-z);
                    player1.setHealth(player1.getHealth()-y);
                }
                if(x==2){
                    double b=buff.nextInt(6)*.4;
                    System.out.println("You fiercely guard, you take "+w);
                    System.out.println("You're Attack increases "+b);
                    atBuff=atBuff+b;
                    player1.setHealth(player1.getHealth()-w);
                }


        }
        if(player1.getHealth()>0){
            System.out.println("Player Wins!");
        }
        if(player1.getHealth()<=0){
            System.out.println("Player Loses");
        }

    }
}
