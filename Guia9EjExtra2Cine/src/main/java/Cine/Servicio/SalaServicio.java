/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine.Servicio;

import Cine.Entidades.Sala;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class SalaServicio {

    Scanner leer = new Scanner(System.in);
    Sala s = new Sala();

    public String[][] crearSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (i) {
                    case 0:
                        s.getAsientos()[i][j] = "1";
                        break;
                    case 1:
                        s.getAsientos()[i][j] = "2";
                        break;
                    case 2:
                        s.getAsientos()[i][j] = "3";
                        break;
                    case 3:
                        s.getAsientos()[i][j] = "4";
                        break;
                    case 4:
                        s.getAsientos()[i][j] = "5";
                        break;
                    case 5:
                        s.getAsientos()[i][j] = "6";
                        break;
                    case 6:
                        s.getAsientos()[i][j] = "7";
                        break;
                    case 7:
                        s.getAsientos()[i][j] = "8";
                        break;
                }
                switch (j) {
                    case 0:
                        s.getAsientos()[i][j] += "A";
                        break;
                    case 1:
                        s.getAsientos()[i][j] += "B";
                        break;
                    case 2:
                        s.getAsientos()[i][j] += "C";
                        break;
                    case 3:
                        s.getAsientos()[i][j] += "D";
                        break;
                    case 4:
                        s.getAsientos()[i][j] += "E";
                        break;
                    case 5:
                        s.getAsientos()[i][j] += "F";
                        break;

                }

            }

        }
        return s.getAsientos();

    }

    public void mostrarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(s.getAsientos()[i][j]);
            }
            System.out.println("");

        }
    }


}
