/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona.Servicio;

import Persona.Entidades.DNI;
import Persona.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    List<Persona> listaPersonas = new ArrayList();
    
    public Persona generarPersona(){
        Persona p = new Persona();
        DNI doc = new DNI();
        System.out.println("ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("ingrese apellido");
        p.setApellido(leer.next());
        System.out.println("debe ingresar un dni");
        System.out.println("ingrese la serie");
        doc.setSerie(leer.next());
        System.out.println("ingrese el n°");
        doc.setNumero(leer.nextInt());
        
        return p;
    }
    public void agregarPersona(){
        System.out.println("cuantas personas desea ingresar?");
        int cant= leer.nextInt();
        for (int i = 0; i < cant; i++) {
            listaPersonas.add(generarPersona());   
        }
    }
    public void mostrarPersonas(){
        for (Persona aux : listaPersonas) {
            System.out.println(aux.toString());
        }
        System.out.println("la cantidad de personas ingresadas son: " + listaPersonas.size());

    }
}
