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
        corridori.add(new Corridore("RUNNER 1", 1, testimone));
        corridori.add(new Corridore("RUNNER 2", 2, testimone));
        corridori.add(new Corridore("RUNNER 3", 3, testimone));
        corridori.add(new Corridore("RUNNER 4", 4, testimone));
        
        GameManager manager = new GameManager(corridori);

        GameForm form = new GameForm();
        for (Corridore c : corridori) {
            c.addObserver(form);
            c.setManager(manager);
        }

        form.setCorridori(corridori);
        form.setManager(manager);
        form.setVisible(true);
    }
}
