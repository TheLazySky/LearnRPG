import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import character.*;
import java.util.*;
import java.io.*;

public class LinkStart extends Application{
    static int x;

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");

        Button save = new Button("Save");
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            saveGame();
            }
        });

        Scene scene = new Scene(save, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



    public static void main(String[] args){
        Application.launch(args);
        LinkStart game = new LinkStart();

        game.Welcome();
        game.characterSetup();
        game.saveGame();

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

            Player main = new Player();

            switch (rac) {
                case "1":
                    aHuman a = new aHuman();
                    a.setRace("Human");
                    a.setName(nam);
                    main = a;
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }


            System.out.println("Info: " + main.getRace());
        }else {
            System.out.println("welcome back");//insert methods for reloading save data
        }
        }

    public void saveGame() {
        System.out.println();
    }
}