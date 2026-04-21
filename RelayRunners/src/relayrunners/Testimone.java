/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relayrunners;

/**
 *
 * @author PAZZAGLI.ANGELICA
 */
public class Testimone {
    private boolean inCorsa;
    
    public synchronized void corri() throws InterruptedException {
        while(inCorsa) {
            System.out.println("Attesa testimone");
            wait();
        }
        inCorsa = true;
        System.out.println("Entrata in corsa");
    }
    
    public synchronized void passa() {
        inCorsa = false;
        System.out.println("Passaggio testimone");
        notifyAll();
    }
}
