/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia9ej1adopcion;

import Entidades.Persona;
import Servicio.Adopcion;
import Servicio.PerroServicio;
import Servicio.PersonaServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia9Ej1Adopcion {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        PerroServicio pes = new PerroServicio();
        Adopcion ad = new Adopcion();
        ad.adpocion();
       
        ps.mostrarPersonas();
        pes.mostrarPerros();
        ad.mostrar();
        

    }
}
