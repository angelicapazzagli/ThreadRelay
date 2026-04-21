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
    
}
