package soccer_11_1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.*;
import soccer_11_1.Player;

/**
 *
 * @author sheld
 */
public class PlayerDatabase {

    /* Practice 11-2. Declare an ArrayList here */
    private ArrayList<Player> players;

    /* Practice 11-2. Add Constructor here */
    public PlayerDatabase() {
        StringTokenizer authorTokens = new StringTokenizer(authorList, ", ");
        players = new ArrayList();
        while (authorTokens.hasMoreTokens()) {
            players.add(new Player(authorTokens.nextToken()));
        }
    }

    /* Practice 11-2. Add getTeam() method here */
    public Player[] getTeam(int numOfPlayers) {
        Player[] teamPlayers = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            int playerIndex = (int) (Math.random() * players.size());
            teamPlayers[i] = players.get(playerIndex);
            players.remove(playerIndex);
        }
        return teamPlayers;
    }

    String authorList
            = "Agatha Christie,"
            + "Alan Patton,"
            + "Alexander Solzhenitsyn,"
            + "Arthur Conan Doyle,"
            + "Anthony Trollope,"
            + "Baroness Orczy,"
            + "Brendan Behan,"
            + "Brian Moore,"
            + "Boris Pasternik,"
            + "Charles Dickens,"
            + "Charlotte Bronte,"
            + "Dorothy Parker,"
            + "Emile Zola,"
            + "Frank O'Connor,"
            + "Geoffrey Chaucer,"
            + "George Eliot,"
            + "G. K. Chesterton,"
            + "Graham Green,"
            + "Henry James,"
            + "James Joyce,"
            + "J. M. Synge,"
            + "J. R. Tolkien,"
            + "Jane Austin,"
            + "Leo Tolstoy,"
            + "Liam O'Flaherty,"
            + "Marcel Proust,"
            + "Mark Twain,"
            + "Oscar Wilde,"
            + "O. Henry,"
            + "Samuel Beckett,"
            + "Sean O'Casey,"
            + "William Shakespeare,"
            + "William Makepeace Thackeray,"
            + "W. B. Yeats,"
            + "Wilkie Collins";

}