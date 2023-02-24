/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Adopcion {

    Persona perso = new Persona();
    Perro perro = new Perro();
    PersonaServicio ps = new PersonaServicio();
    PerroServicio pes = new PerroServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void adpocion() {
        ps.crearPersona();
        pes.crearPerro();

        String usuario;
        String perro;
        Boolean errorH = false;
        Boolean errorA = false;
        int opc;
        do {
            System.out.println("ingrese el nombre de la persona");
            usuario = leer.next();

            for (int i = 0; i < ps.listaPersonas.size(); i++) {
                if (usuario.equals(ps.listaPersonas.get(i).getNombre())) {
                    errorH = true;
                    System.out.println("ingrese el nombre del perro que quiere adoptar");
                    perro = leer.next();
                    for (int j = 0; j < pes.listaPerros.size(); j++) {
                        if (pes.listaPerros.get(j).getNombre().equals(perro)) {
                            errorA = true;
                            if (pes.listaPerros.get(j).getAdoptado() == true) {
                                System.out.println("el perro " + pes.listaPerros.get(j).getNombre() + " ya ha sido adoptado :(");
                            } else {
                                
                                ps.listaPersonas.get(i).setDog(pes.listaPerros.get(j));
                                pes.listaPerros.get(j).setAdoptado(true);
                            }

                        }

                    }
                }

            }
            if (errorH == false) {
                System.out.println("no existe la persona");
            }
            if (errorA == false) {
                System.out.println("no existe el perro");
            }
            System.out.println("desea continuar? 1) si/ 2) no");
            opc = leer.nextInt();

        } while (opc != 2);

    }

    public void mostrar() {
        for (Persona aux : ps.listaPersonas) {
            System.out.println(aux);
        }
    }

}
