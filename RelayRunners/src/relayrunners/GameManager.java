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
    private Velocità velocità = Velocità.REGULAR;
    private boolean pausa = false;

    public GameManager(ArrayList<Corridore> corridori) {
        this.corridori = corridori;
    }

    public void startRace() {
        for(Corridore c : corridori) {
            c.start();
        }
    }
    
    public void setVelocità(String v) {
        switch (v) {
            case "Slow":
                velocità = Velocità.SLOW;
                break;
            case "Regular":
                velocità = Velocità.REGULAR;
                break;
            case "Fast":
                velocità = Velocità.FAST;
                break;
        }
    }
    
    public int getDelay() {
        switch (velocità) {
            case SLOW:
                return 100;
            case REGULAR:
                return 50;
            case FAST:
                return 20;
            default:
                return 50;
        }
    }
    
    public synchronized void stop() {
        pausa = true;
    }

    public synchronized void riprendi() {
        pausa = false;
        notifyAll();
    }

    public synchronized void checkPausa() throws InterruptedException {
        while (pausa) {
            wait();
        }
    }
}
