/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Servicio;

import Cine.Entidades.Espectador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin Norton
 */
public class EspectadorServicio {
    List<Espectador> gentes = new ArrayList();
    Espectador p1 = new Espectador("juan", 23, 500);
    Espectador p2 = new Espectador("carlos", 12, 50);
    Espectador p3 = new Espectador("pepe", 18, 5200);
    Espectador p4 = new Espectador("juancito", 10, 0);
    Espectador p5 = new Espectador("juanca", 23, 500);
    public List llenarGentes(){
        gentes.add(p1);
        gentes.add(p2);
        gentes.add(p3);
        gentes.add(p4);
        gentes.add(p5);
        
        return gentes;
    }
    
}
