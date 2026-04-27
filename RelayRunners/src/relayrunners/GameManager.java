/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relayrunners;

import java.util.ArrayList;

/**
 *
 * @author 39333
 */
public class GameManager {
    private Testimone testimone;
    private ArrayList<Corridore> corridori;

    public GameManager(Testimone testimone, ArrayList<Corridore> corridori) {
        this.testimone = testimone;
        this.corridori = corridori;
    }

    public void startRace() {
        for(Corridore c : corridori) {
            c.start();
        }
    }
}
