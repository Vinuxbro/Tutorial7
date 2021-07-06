package com.company;

import javax.sound.sampled.AudioFormat;
import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PlayerSelection {


    public static void main(String[] args) {
        int playersno=0;

        Player player1=new Player("Wanidu De Silva",24,"bowler",45.3,1);
        Player player2=new Player("Lakshan Sandakan",29,"bowler",45.3,2);


        // player1.getpalyerDetails("Wanidu De Silva");
        String[] players=new String[5];
        players[0]=player1.getPlayerName(1);
        players[1]=player2.getPlayerName(2);

        System.out.println(Arrays.toString(players));



        boolean done=false;

        while (done!=true){
            Scanner input=new Scanner(System.in);
            System.out.println(
                    "A: Add Players\n" + "B: Display two best batmans\n" + "C: Display two best bowlers\n" + "D: Display the best Keeper\n"+
                            "V:view all players\n"+"E: Exit"
            );
            String userInput=input.nextLine();
            if (userInput.equalsIgnoreCase("A")){
                //add player

                addPlayer(players,playersno);
                System.out.println(Arrays.toString(players));



            }
            else if (userInput.equalsIgnoreCase("B")){
                //Display Two best batsmans
            }
            else if (userInput.equalsIgnoreCase("C")){
                //Display two best bowlers
            }

            else if(userInput.equalsIgnoreCase("E")){
                done=true;

            }




        }






    }
    public static void addPlayer(String[] names,int playerNo){
        Scanner inputname=new Scanner(System.in);
        System.out.print("enter the player's name:");
        String name=inputname.nextLine();

        Scanner inputage=new Scanner(System.in);
        System.out.print("enter the player's age:");
        int age=inputage.nextInt();

        Scanner inputtype=new Scanner(System.in);
        System.out.print("enter the player's type:");
        String type=inputtype.nextLine();

        Scanner inputstats=new Scanner(System.in);
        System.out.print("enter the player's stats:");
        Double stats=inputstats.nextDouble();

        Player player=new Player(name,age,type,stats,playerNo);

        names[playerNo]=player.getPlayerName(playerNo);

        playerNo++;






    }







}
