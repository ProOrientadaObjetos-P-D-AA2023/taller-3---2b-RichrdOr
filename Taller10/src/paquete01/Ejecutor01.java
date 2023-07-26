/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.Arquero;
import paquete02.Guerrero;
import paquete02.Mago;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

        Guerrero guerrero = new Guerrero(14
                , "Blixt"
                , 5
                , 34);

        Mago mago = new Mago
        (23
                , "Maxek"
                , 4
                , 33);

        Arquero arquero = new Arquero(23
                , "Nemesis"
                , 3
                , 34);

        boolean bandera = true;

        System.out.println("DATOS de batalla:\nSi el personaje tiene:"
                + "mayor ninel Gana la batalla\n"
                + "menor nivel se retira la batalla\n"
                + "Si pierde baja de nivel"
                + "tienen el mismo nivel empatan"
                + "nivel maximo es 10"
                + "");
        
        System.out.println("-------------------------------------");
        while (bandera) {

            System.out.println("Batalla\n"
                    + "1. para que el Arquero ataque al mago\n"
                    + "2. para que el mago ataque al Guerrero\n"
                    + "3. para que el guerrero ataque al arquero\n"
                    + "4. Salir y  Mostrar los nuevo datos de los personajes");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("la batalla acaba de inciar!!!");

                    arquero.atacar();
                    System.out.println("al mago " + mago.getNombre());
                    if (arquero.getNivel() > mago.getNivel()) {
                        System.out.println("El arquero le hizo daño al mago "
                                + mago.getNombre() + ""
                                + " y gano la batalla");

                        arquero.aumentarNivel();

                    }
                    if (arquero.getNivel() < mago.getNivel()) {
                        mago.defender();
                        System.out.println("y!!!!");
                        mago.atacar();
                        System.out.println("El arquero " + arquero.getNombre()
                                + " perdio la batalla");
                        mago.aumentarNivel();
                        arquero.bajarNivel();

                    } else if (arquero.getNivel() == mago.getNivel()) {
                        arquero.Empate();
                    }
                    System.out.println("-------------");
                    break;

                case 2:
                    System.out.println("la batalla acaba de inciar!!!");

                    mago.atacar();
                    System.out.println("al Guerrero " + guerrero.getNombre());
                    if (mago.getNivel() > guerrero.getNivel()) {
                        System.out.println("El Mago " + mago.getNombre()
                                + " hizo daño al guerrero " + guerrero.getNombre()
                                + " y gano la batalla");

                        mago.aumentarNivel();

                    }
                    if (mago.getNivel() == guerrero.getNivel()) {

                        mago.Empate();

                    } else if (mago.getNivel() < guerrero.getNivel()) {
                        guerrero.defender();

                        System.out.println("El mago " + mago.getNombre() + " se retira");

                    }
                    System.out.println("----------");

                    break;
                case 3:
                    System.out.println("la batalla acaba de inciar!!!");

                    guerrero.atacar();
                    System.out.println("al arquero " + arquero.getNombre());
                    if (guerrero.getNivel() > arquero.getNivel()) {
                        System.out.println("El guerrero hizo daño al arquero  "
                                + arquero.getNombre() + " y gano la batalla");

                        guerrero.aumentarNivel();

                    }
                    if (guerrero.getNivel() == arquero.getNivel()) {
//                        
                        guerrero.Empate();
                    } else if (guerrero.getNivel() < arquero.getNivel()) {
                        arquero.defender();
                        System.out.println("El " + guerrero.getNombre() + " se retira");

                    }
                    break;
                case 4:
                    bandera = false;
                    System.out.println("Salinedo del modo batalla");
                    System.out.println("----------------------------");
                    System.out.printf("personaje:\n"
                            + "guerrero--> nombre: %s  Fuerza: %d  Nivel: %d Puntos de vida: %d",
                            guerrero.getNombre(),
                            guerrero.getFuerza(),
                            guerrero.getNivel(),
                            guerrero.getPuntosVida());

                    System.out.println("\n-----------------\n");
                    System.out.printf("Mago:-->  nombre: %s  Poder Magico: "
                            + "%d  Nivel: %d Puntos de vida: %d",
                            mago.getNombre(),
                            mago.getPoderMagico(),
                            mago.getNivel(),
                            mago.getPuntosVida());

                    System.out.println("\n----------------\n");
                    System.out.printf("Arquero: --> nombre: %s  Precicion: "
                            + "%s  Nivel: %d Puntos de vida: %d",
                            arquero.getNombre(),
                            arquero.getPrecicion(),
                            arquero.getNivel(),
                            arquero.getPuntosVida());

                    break;
                default:
                    System.out.println("Error de opcion de batalla");

            }

        }

    }
    
}
