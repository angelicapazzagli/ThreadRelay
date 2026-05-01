package relayrunners;

import java.util.ArrayList;

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
        
        ArrayList<Corridore> corridori = new ArrayList<>();
        corridori.add(new Corridore("Angelica", 1, testimone));
        corridori.add(new Corridore("Rachele", 2, testimone));
        corridori.add(new Corridore("Sara", 3, testimone));
        corridori.add(new Corridore("Elena", 4, testimone));

        GameForm form = new GameForm();
        for (Corridore c : corridori) {
            c.addObserver(form);
        }

        GameManager manager = new GameManager(corridori);

        form.setCorridori(corridori);
        form.setManager(manager);
        form.setVisible(true);
    }
}
