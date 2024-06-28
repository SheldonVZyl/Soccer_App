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
public class League {

    public static void main(String[] args) {
        League theLeague = new League();

        //calling createTeams method
        Team[] theTeams = theLeague.createTeams();
        //calling createGames method
        Game[] theGames = theLeague.createGames(theTeams);

        //**********************************GAMES***************************
        for(Game currGame: theGames) {
        currGame.playGame();
        System.out.println(currGame.getDescription());
        }
    }

    public static Team[] createTeams() {
        //***************TEAM1 (THE GREENS)**********
        //9.2
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team("The Greens", thePlayers);

        //player1.playerName = "Robert Service";
        team1.setPlayerArray(thePlayers);

        //***************TEAM2 (THE REDS)**********
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        //9.2
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player("Robert Service");
        team2.getPlayerArray()[1] = new Player("Robbie Burns");
        team2.getPlayerArray()[2] = new Player("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;

    }

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }
}