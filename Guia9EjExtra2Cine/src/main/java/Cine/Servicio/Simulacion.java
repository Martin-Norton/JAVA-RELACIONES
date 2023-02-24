/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Servicio;

/**
 *
 * @author Martin Norton
 */
public class Simulacion {
    SalaServicio ss= new SalaServicio();
    PeliculaServicio ps = new PeliculaServicio();
    CineServicio cs = new CineServicio();
    public void simulacion (){
    

     cs.llenarCine();
     
    }
    
}
