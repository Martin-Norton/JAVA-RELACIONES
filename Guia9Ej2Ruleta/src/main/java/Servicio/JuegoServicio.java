/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class JuegoServicio {

    Scanner leer = new Scanner(System.in);
    RevolverServicio rs = new RevolverServicio();
    JugadorServicio js = new JugadorServicio();
    Juego juego = new Juego();
    

    public void llenarJuego() {
        System.out.println("cuantos jugadores quere´ ");
        int cant = leer.nextInt();
        if (cant > 6) {
            cant = 6;
        }
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            j.setNombre("jugador");
            juego.getJugadores().add(j);
        }
                    for (Jugador aux : juego.getJugadores()) {
            System.out.println(aux.toString());
        }
        juego.setRevolver(rs.llenarRevolver());
    }

    public void ronda() {
        //ArrayList<Jugador>jugadores= juego.getJugadores();
        Revolver r = juego.getRevolver();
        
        for (Jugador aux : juego.getJugadores()) {
            System.out.println("-------");
            Boolean estaLinda = js.disparo();
            System.out.println(aux.getId());
            if (estaLinda == true) {
                System.out.println("el jugador " + aux.getId() + " se mojo");
                System.out.println("juego finalizado");
                //break;
            }else{
                System.out.println("el jugador " + aux.getId() + " no se mojo ");
            }
        }

    }

}
