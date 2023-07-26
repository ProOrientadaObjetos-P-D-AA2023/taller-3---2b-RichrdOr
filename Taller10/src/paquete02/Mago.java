/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Mago extends Personaje {

    private int pMagico;

    public Mago(int pMagico, String nombre, int nivel, int pVida) {
        super(nombre, nivel, pVida);
        this.pMagico = pMagico;
    }

    public int getPoderMagico() {
        return pMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.pMagico = poderMagico;
    }

   
    @Override
    public void atacar() {
        System.out.println(nombre + " lanza el hechizo de hielo con un poder mágico de " + pMagico);
    }
    
   

    @Override
    public void defender() {
        System.out.println("El mago " + nombre + " crea un escudo mágico para defenderse del ataque.");
    }  
}
