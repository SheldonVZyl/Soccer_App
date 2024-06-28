package soccer_09_2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_09_1.*;
import soccer_08_3.*;
import soccer_08_2.*;
import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;
import soccer_09_2.GameUtils;

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
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.getGoals()) {
            returnString.append("Goal scored after " + currGoal.getTheTime() + " mins by "
                    + currGoal.getThePlayer().getPlayerName() + " of " + currGoal.getTheTeam().getTeamName() + "\n");

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