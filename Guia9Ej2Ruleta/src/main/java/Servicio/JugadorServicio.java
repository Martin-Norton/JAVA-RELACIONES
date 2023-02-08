/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Jugador;


/**
 *
 * @author Martin Norton
 */
public class JugadorServicio {
    Jugador j = new Jugador();
    
    public Boolean disparo(RevolverServicio r){
        Boolean disp;
        if (r.mojar()) {
            j.setMojado(false);
            
        }else{
            r.siguienteChorro();
    
        }
        
        return !(j.getMojado());
    }
}
