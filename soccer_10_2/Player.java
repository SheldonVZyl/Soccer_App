package soccer_10_2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_10_1.*;
import soccer_09_2.*;
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
public class Player {

    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {

    }

    //getter method
    public String getPlayerName() {
        return playerName;
    }

    //setter method
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}