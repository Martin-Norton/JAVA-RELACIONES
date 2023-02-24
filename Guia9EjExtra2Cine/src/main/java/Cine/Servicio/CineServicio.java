/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Servicio;

import Cine.Entidades.Cine;
import Cine.Entidades.Espectador;
import Cine.Entidades.Pelicula;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class CineServicio {

    Random r = new Random();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EspectadorServicio es = new EspectadorServicio();
    SalaServicio ss = new SalaServicio();
    PeliculaServicio ps = new PeliculaServicio();
    Cine c = new Cine();

    public void llenarCine() {
        ps.cargarPeliculas();
        es.llenarGentes();
        c.setLugaresOcupados(ss.crearSala());

        System.out.println("ingrese el nombre de la pelicula que va a ver ahora la sala 1");
        String elec = leer.next();
        for (Pelicula aux : ps.pelis) {
            if (elec.equals(aux.getTitulo())) {
                c.setPeliRep(aux);
            }
        }
        System.out.println("ingrese el precio de la entrada para la pelicula: " + c.getPeliRep().getTitulo());
        c.setPrecioEntrada(leer.nextInt());
        
        for (Espectador aux : es.gentes) {
            int random1 = r.nextInt(8 - 1) + 1;
            int random2 = r.nextInt(6 - 1) + 1;
            if (aux.getEdad() >= c.getPeliRep().getEdadMinima() && aux.getDinero() >= c.getPrecioEntrada()&&c.getLugaresOcupados()[random1][random2].length()<3) {

                c.getLugaresOcupados()[random1][random2] += "X";
               

            }else if (aux.getEdad() < c.getPeliRep().getEdadMinima()) {
                System.out.println(aux.getNombre()+" no tiene la edad necesaria para ver la pelicula");
            }else if (aux.getDinero() < c.getPrecioEntrada()) {
                 System.out.println(aux.getNombre()+" no tiene el dinero necesario para pagar la entrada");
            }
            
        }

        System.out.println("los lugares ocupados son: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(c.getLugaresOcupados()[i][j]+" ");
            }
            System.out.println("");
            System.out.println("");

        }

    }

}
