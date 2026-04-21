/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relayrunners;

/**
 *
 * @author PAZZAGLI.ANGELICA
 */
public class Corridore extends Thread{
    private String nome;
    private Testimone testimone;
    
    public Corridore(String nome, Testimone testimone) {
        this.nome = nome;
        this.testimone = testimone;
    }
    
    @Override
    public void run() {
        try {
            testimone.corri(nome);
            System.out.println(nome + " In corsa");
            Thread.sleep(2000);
            testimone.passa(nome);
        } catch (InterruptedException ex) {
            System.getLogger(Corridore.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
}
