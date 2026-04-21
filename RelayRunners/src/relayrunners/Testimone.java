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
    
    public synchronized void corri(String nome) throws InterruptedException {
        while(inCorsa) {
            System.out.println(nome + " Attesa testimone");
            wait();
        }
        inCorsa = true;
        System.out.println(nome + " Entrata in corsa");
    }
    
    public synchronized void passa(String nome) {
        inCorsa = false;
        System.out.println(nome + " Passaggio testimone");
        notifyAll();
    }
}
