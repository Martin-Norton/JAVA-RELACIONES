/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugadores.Entidades;

/**
 *
 * @author Martin Norton
 */
public class Jugadores {
    private String nombre , apellido , posicion;
    private Integer numero;

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
    }
    
    
}
