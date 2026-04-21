package relayrunners;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pazzagli.angelica
 */
public class RelayRunners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Testimone testimone = new Testimone();
        
        Corridore c1 = new Corridore("Angelica", testimone);
        Corridore c2 = new Corridore("Rachele", testimone);
        Corridore c3 = new Corridore("Sara", testimone);
        Corridore c4 = new Corridore("Elena", testimone);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
    
}
