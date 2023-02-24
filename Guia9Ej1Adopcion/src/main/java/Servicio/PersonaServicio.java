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
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    List<Persona> listaPersonas = new ArrayList();

    public List crearPersona() {
        
        String opc;
        do {
            Persona p = new Persona();
            System.out.println("ingrese el nombre y apellido de la persona");
            p.setNombre(leer.next());
            p.setApellido(leer.next());
            System.out.println("ingrese la edad y el DNI");
            p.setEdad(leer.nextInt());
            p.setDni(leer.nextInt());

            listaPersonas.add(p);

            System.out.println("desea agregar otra persona? (s/n)");
            opc = leer.next();

        } while (opc.equals("s"));
        
        return listaPersonas;
    }
    public void mostrarPersonas(){
        for (Persona Persona : listaPersonas) {
            System.out.println(Persona.toString());
        }
    }

}
