/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugadores.Servicio;

import Jugadores.Entidades.Equipo;
import Jugadores.Entidades.Jugadores;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Servicio {
    Equipo e = new Equipo();
    Scanner leer = new Scanner(System.in);
    public Jugadores generarJugador(){
        Jugadores j = new Jugadores();
        System.out.println("ingrese el nombre del jugador");
        j.setNombre(leer.next());
        System.out.println("ingrese apellido");
        j.setApellido(leer.next());
        System.out.println("INGRESE POSICION");
        j.setPosicion(leer.next());
        System.out.println("ingrese el numero del jugador");
        j.setNumero(leer.nextInt());
        
        return j;
    }
    public void agregarJugador(){
        
        int opc;
        do {
            e.getEquipo().add(generarJugador());
            System.out.println("desea ingresar un nuevo jugador?");
            System.out.println("1) si");
            System.out.println("2) no");
            opc=leer.nextInt();
            
        } while (opc!=2);
    }
    public void mostrarJugadores(){
        
        for (Jugadores aux : e.getEquipo()) {
            System.out.println(aux);
            
        }
        
    }
    
}
