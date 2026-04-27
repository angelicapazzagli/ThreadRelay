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
    private int turno = 1;
    
    public synchronized void corri(String nome, int numero) throws InterruptedException {
        while(numero != turno) {
            System.out.println(nome + " Attesa testimone");
            wait();
        }
        System.out.println(nome + " Entrata in corsa");
    }
    
    public synchronized void passa(String nome) {
        System.out.println(nome + " Passaggio testimone");
        turno++;
        notifyAll();
    }
}
