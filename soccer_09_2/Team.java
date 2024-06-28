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

/**
 *
 * @author sheld
 */
public class Team {

    private String teamName;
    private Player[] playerArray;
    
    //9.2
    public Team(String teamName) {
        this.teamName = teamName;
    }
    //9.2
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    //9.2
    public Team() {
    
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
}