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
    
    public synchronized void attendiTurno(int numero) throws InterruptedException {
        while(numero != turno) {
            wait();
        }
    }
    
    public synchronized void sbloccaSuccessivo() {
        turno++;
        notifyAll();
    }
}
