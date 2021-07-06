package com.company;

import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerAge;
    private String playerType;
    private double playerStat;
    private int playerNo;

    public Player(String playerName, int playerAge, String playerType, double playerStat,int playerNo) {
        this.playerName=playerName;
        this.playerAge=playerAge;
        this.playerStat=playerStat;
        this.playerType=playerType;
        this.playerNo=playerNo;
    }




    void getpalyerDetails(String playerName){
        System.out.println("player name :"+playerName);
        System.out.println("player age :"+playerAge);
        System.out.println("player stats :"+playerStat);
        System.out.println("player type :"+playerType);

    }
    void getbestPerformance(String playerName){
        System.out.println("player name :"+playerName);


    }
    private void getPlayerType(){
        System.out.println("player Type :"+playerType);


    }
    String getPlayerName(int playerNo){
        String playername=playerName;
        return playername;
    }
    static void battingAvg() {
        int[] runs ;
        runs =new int[15];
        double totalruns=0;
        System.out.println("Enter Runs of past matches: ");

        for(int i=0; i<runs.length; i++){
            Scanner s =new Scanner(System.in);
            runs[i] = s.nextInt();
            totalruns = totalruns + runs[i];
        }
        double battingAvg= totalruns/ runs.length;
        System.out.println("Batting Average :"+battingAvg);
    }

    static void bowlingAvg() {
        int[] wickets ;
        wickets =new int[15];
        int totalwickets=0;
        System.out.println("Enter Runs of past matches: ");

        for(int i=0; i<wickets.length; i++){
            Scanner s =new Scanner(System.in);
            wickets[i] = s.nextInt();
            totalwickets = totalwickets + wickets[i];
        }
        double bowlingAvg= totalwickets/ wickets.length;
        System.out.println("Bowling Average :"+bowlingAvg);
    }








}
