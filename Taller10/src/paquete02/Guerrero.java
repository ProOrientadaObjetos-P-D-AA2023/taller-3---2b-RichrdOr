/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Guerrero extends Personaje {
 private int fuerza;

    public Guerrero(int fuerza, String nombre, int nivel, int pVida) {
        super(nombre, nivel, pVida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

  
    @Override
    public void atacar() {
        System.out.println(nombre + " realiza un ataque con su puño con una fuerza de " + fuerza);
        
    }

    @Override
    public void defender() {
        System.out.println("El guerrero " + nombre + " se defiende con un escudo....");
    }    
}
