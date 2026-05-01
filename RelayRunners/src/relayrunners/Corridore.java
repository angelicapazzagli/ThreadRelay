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
    
    @Override
    public void run() {
        try {
            testimone.corri(nome, numero);
            System.out.println(nome + " In corsa");
            Thread.sleep(2000);
            testimone.passa(nome);
        } catch (InterruptedException ex) {
            System.getLogger(Corridore.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
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
