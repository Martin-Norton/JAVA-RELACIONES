/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Revolver;
import java.util.Random;

/**
 *
 * @author Martin Norton
 */
public class RevolverServicio {
    Revolver r = new Revolver();
    Random ran = new Random();
        
    public Revolver llenarRevolver(){
        r.setPosAct((ran.nextInt(6)+1));
        r.setPosAgua((ran.nextInt(6)+1));
        
        return r;
    }
    public Boolean mojar(){
        Boolean mojo;
        if (r.getPosAct()==r.getPosAgua()) {
            mojo = true;
        }else{
            mojo=false;
        }
        return mojo;
    }
    public void siguienteChorro(){
        if (r.getPosAct()==6) {
            r.setPosAct(1);
        }else{
            r.setPosAct(r.getPosAct()+1);
        }
    }
    public void mostrarRevolver(){
        r.toString();
    }
    
}
