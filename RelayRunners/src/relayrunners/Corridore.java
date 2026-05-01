/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relayrunners;

import java.util.ArrayList;

/**
 *
 * @author PAZZAGLI.ANGELICA
 */
public class Corridore extends Thread implements Subject{
    private String nome;
    private int numero;
    private Testimone testimone;
    private final ArrayList<Observer> observers = new ArrayList();
    private volatile int progresso = 0;
    
    public Corridore(String nome, int numero, Testimone testimone) {
        this.nome = nome;
        this.numero = numero;
        this.testimone = testimone;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public void run() {
        try {
            testimone.attendiTurno(numero);
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                setProgresso(i);
                if (i == 90) {
                    testimone.sbloccaSuccessivo();
                }
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public synchronized void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public synchronized void notifyObservers() {
        ArrayList<Observer> copia = new ArrayList(observers);
        for (Observer o : copia) {
            o.update(numero, progresso);
        }
    }

    private void setProgresso(int p) {
        this.progresso = p;
        notifyObservers();
    }
}
