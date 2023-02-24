/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Servicio;

import Cine.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> pelis = new ArrayList();
    

    public void cargarPeliculas() {
        int opc;
        do {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());
            System.out.println("Ingrese una edad minima para verla");
            p.setEdadMinima(leer.nextInt());
            pelis.add(p);
            System.out.println("desea cargar otra pelicula? 1) si / 2) no");
            opc=leer.nextInt();
        } while (opc!=2);
    }
    public Pelicula cargarPelicula() {
        
        
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());
            System.out.println("Ingrese una edad minima para verla");
            p.setEdadMinima(leer.nextInt());
            
            return p;
    }
}
