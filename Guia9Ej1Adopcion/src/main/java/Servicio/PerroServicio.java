/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in);
    public List<Perro> listaPerros = new ArrayList();

    public List crearPerro() {
        
        String opc;
        do {
            Perro pe = new Perro();
            System.out.println("ingrese el nombre del perro");
            pe.setNombre(leer.next());
            System.out.println("ingrese la raza del perro");
            pe.setRaza(leer.next());
            System.out.println("ingrese el tamaño del choco");
            pe.setTamaño(leer.next());
            System.out.println("ingrese la edad del perro");
            pe.setEdad(leer.nextInt());
            
            listaPerros.add(pe);
            
            System.out.println("desea agregar otro perro? (s/n)");
            opc = leer.next();
            
        } while (opc.equals("s"));

        return listaPerros;
    }
    public void mostrarPerros(){
        for (Perro listaPerro : listaPerros) {
            System.out.println(listaPerro.toString());
        }
    }
}
