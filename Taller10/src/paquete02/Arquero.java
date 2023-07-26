
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Arquero extends Personaje {
    private int precicion;

    public Arquero(int precicion, String nombre, int nivel, int pVida) {
        super(nombre, nivel, pVida);
        this.precicion = precicion;
    }

    public int getPrecicion() {
        return precicion;
    }

    public void setPrecicion(int precicion) {
        this.precicion = precicion;
    }
    
    
    @Override
    public void atacar(){
        System.out.println(nombre + " dispara una flecha con precision de precicion de -> " + precicion);
    }
    
    @Override
    public void defender(){
        System.out.println("El arquero " + nombre + "  su rapidez para esquivar ataques es:.");
    } 
}
