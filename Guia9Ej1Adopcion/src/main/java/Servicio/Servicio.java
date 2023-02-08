/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    List<Persona> personas = new ArrayList();

    public void crearPersona(){
        Persona p = new Persona() ;
        System.out.println("ingrese el nombre y apellido de la persona");
        p.setNombre(leer.next());
        p.setApellido(leer.next());
        System.out.println("ingrese la edad y el DNI");
        p.setEdad(leer.nextInt());
        p.setDni(leer.nextInt());
        p.setDog(crearPerro());
        
        personas.add(p);
    }
    public Perro crearPerro(){
        Perro pe = new Perro();
        System.out.println("ingrese el nombre del perro");
        pe.setNombre(leer.next());
        System.out.println("ingrese la raza del perro");
        pe.setRaza(leer.next());
        System.out.println("ingrese el tamaño del choco");
        pe.setTamaño(leer.next());
        System.out.println("ingrese la edad del perro");
        pe.setEdad(leer.nextInt());
        
       return pe;
    }
    public void mostrar(){
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
    
    }

}
