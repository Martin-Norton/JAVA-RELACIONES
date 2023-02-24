/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Entidades;

/**
 *
 * @author Martin Norton
 */
public class Cine {
    private int precioEntrada;
    private Pelicula peliRep;
    private String[][] lugaresOcupados;

    public Cine() {
    }

    public Cine(int precioEntrada, Pelicula peliRep, String[][] lugaresOcupados) {
        this.precioEntrada = precioEntrada;
        this.peliRep = peliRep;
        this.lugaresOcupados = lugaresOcupados;
    }

   

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPeliRep() {
        return peliRep;
    }

    public void setPeliRep(Pelicula peliRep) {
        this.peliRep = peliRep;
    }

    public String[][] getLugaresOcupados() {
        return lugaresOcupados;
    }

    public void setLugaresOcupados(String[][] lugaresOcupados) {
        this.lugaresOcupados = lugaresOcupados;
    }

   
    
}
