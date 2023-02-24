/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carta.Service;

import Carta.Entidades.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Carta.Enum.PaloEnum;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Martin Norton
 */
public class CartaServicio {

    Scanner leer = new Scanner(System.in);
    List<Carta> baraja = new ArrayList();
    List<Carta> monton = new ArrayList();

    public void generarBaraja() {

        for (int i = 1; i < 13; i++) {
            for (int j = 0; j < 4; i++) {
                if (i != 8 && i != 9) {
                    Carta ca = new Carta();
                    ca.setNumero(i);
                    if (j == 0) {
                        ca.setPalo(PaloEnum.BASTO);
                    } else if (j == 1) {
                        ca.setPalo(PaloEnum.COPA);
                    } else if (j == 2) {
                        ca.setPalo(PaloEnum.ESPADA);
                    } else if (j == 3) {
                        ca.setPalo(PaloEnum.ORO);
                    }
                    baraja.add(ca);
                }

            }

        }
    }

    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);

        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta(Carta ca) {
        Iterator<Carta> it = baraja.iterator();

        while (it.hasNext()) {
            Carta ca2 = it.next();
            monton.add(ca);
            baraja.remove(ca);
            break;
        }
    }

    public void cartasDisponibles() {
        System.out.println(baraja.size());
    }

    public void darCartas() {
        System.out.println("cuantas cartas quiere?");
        int aux = leer.nextInt();
        if (baraja.size() < aux) {
            System.out.println("no hay tantas cartas");
        } else {
            for (int i = 0; i < aux; i++) {
                System.out.println(baraja.get(i));
                siguienteCarta(baraja.get(i));
            }
        }
        System.out.println("--------------------------------");
    }

    public void cartasMonton() {
        if (monton.size() == 0) {
            System.out.println("no hay cartas en el monton");
        } else {
            for (int i = 0; i < monton.size(); i++) {
                System.out.println(monton.get(i));
            }

        }
    }

    public void menu() {
        generarBaraja();
        int opc;
        do {
            System.out.println("ingrese la opcion deseada");
            System.out.println("----------------------------------");
            System.out.println("1) mostrar baraja ");
            System.out.println("2) barajar");
            System.out.println("3) cantidad de cartas disponibles");
            System.out.println("4) dar cartas");
            System.out.println("5) cartas del monton");
            System.out.println("6) salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    mostrarBaraja();
                    break;
                case 2:
                    barajar();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    System.out.println("hasta luego!");
                    ;
                    break;
            }
        } while (opc != 6);

    }

}
