package soccer_10_1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_09_2.*;
import soccer_09_1.*;
import soccer_08_3.*;
import soccer_08_2.*;
import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;
import soccer_10_1.GameUtils;

/**
 *
 * @author sheld
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    //9.2
    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playGame(int maxGoals) {

        //onlt 1 - 6 goals can be scored
        int numOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();
        
        returnString.append(homeTeam.getTeamName() + " vs. " 
        + awayTeam.getTeamName() + "\n");
        
        for (Goal currGoal : this.getGoals()) {
            //ADDS GOALS
            if (currGoal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
            } else {
                awayTeamGoals++;
            }
            
            returnString.append("Goal scored after " + currGoal.getTheTime() + " mins by "
                    + currGoal.getThePlayer().getPlayerName() + " of " + currGoal.getTheTeam().getTeamName() + "\n");

            //DETERMINES WINNER
            if (homeTeamGoals == awayTeamGoals) {
                returnString.append("It's a draw!");
                homeTeam.incPointsTotal(1);
                awayTeam.incPointsTotal(1);
            } else if (homeTeamGoals > awayTeamGoals) {
                returnString.append(homeTeam.getTeamName() + " win!");
                homeTeam.incPointsTotal(2);
            } else {
                returnString.append(awayTeam.getTeamName() + " win!");
                awayTeam.incPointsTotal(2);
            }
            
            returnString.append(" (" + homeTeamGoals + " - "
                    + awayTeamGoals + ") \n");

        }
        return returnString.toString();
    }
    
    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}