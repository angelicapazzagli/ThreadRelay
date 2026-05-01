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
    private ArrayList<Corridore> corridori;

    public GameManager(ArrayList<Corridore> corridori) {
        this.corridori = corridori;
    }

    public void startRace() {
        for(Corridore c : corridori) {
            c.start();
        }
    }
}
