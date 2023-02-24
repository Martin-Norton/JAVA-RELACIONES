/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;


/**
 *
 * @author Martin Norton
 */
public class JugadorServicio {
    Jugador j = new Jugador();
    RevolverServicio r = new RevolverServicio();
    
    public Boolean disparo(){
        System.out.println("disparo");
        System.out.println(r.toString());
        r.mostrarRevolver();
        Boolean disp= true;

        if (r.mojar()==true) {
            j.setMojado(false);
            disp=true;
        }else{
            disp=false;
            r.siguienteChorro();
    
        }
        
        return (disp);
    }
}
