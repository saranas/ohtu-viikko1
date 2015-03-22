/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ohtuesimerkki.*;

/**
 *
 * @author Akkanen
 */
public class StatisticsTest {

    Player semenko;
    Player lemieux;
    Player kurri;
    Player yzerman;
    Player gretzky;
    List<Player> pitTeam;
    List<Player> detTeam;
    Statistics stats;
    
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(semenko);
            players.add(lemieux);
            players.add(kurri);
            players.add(yzerman);
            players.add(gretzky);
            return players;
        }
    };
    
    @Before
    public void setUp() {
        semenko = new Player("Semenko", "EDM", 4, 12);
        lemieux = new Player("Lemieux", "PIT", 45, 54);
        kurri = new Player("Kurri",   "EDM", 37, 53);
        yzerman = new Player("Yzerman", "DET", 42, 56);
        gretzky = new Player("Gretzky", "EDM", 35, 89);
        pitTeam = new ArrayList<Player>();
        pitTeam.add(lemieux);
        detTeam = new ArrayList<Player>();
        detTeam.add(yzerman);
        stats = new Statistics(readerStub);
        
    }
    
    @Test
    public void searchForPlayer() {
        assertEquals(semenko.getName(), stats.search("Semenko").getName());
        assertEquals(null, stats.search("XYZZY"));
    }
    
    @Test
    public void getListOfPlayers() {
        assertEquals(pitTeam, stats.team("PIT"));
        assertEquals(detTeam, stats.team("DET"));
        assertTrue(stats.team("OIJIOJ").isEmpty());
    }
    
    @Test
    public void giveTopScorers() {
        ArrayList<Player> top = new ArrayList<Player>();
        top.add(gretzky);
        
        ArrayList<Player> top2 = new ArrayList<Player>();
        top2.add(gretzky);
        top2.add(lemieux);
        
        assertEquals(top, stats.topScorers(0));
        assertEquals(top2, stats.topScorers(1));
    }
    
}
