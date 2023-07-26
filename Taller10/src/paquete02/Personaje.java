/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public abstract class Personaje {
    
    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public abstract void atacar();

    public abstract void defender();

    public void aumentarNivel() {
        if(nivel < 10){
        nivel++;
        }
        System.out.println(nombre + " ha subido de nivel..");
    }
    public void bajarNivel() {
        
        if(nivel>0){
        nivel--;
        }
        System.out.println(nombre + " ha bajado de nivel..");
    }
    
    public void Empate(){
        System.out.println("Ambos combatiendes no pueden provocarse daño.....");
    }
 
}
