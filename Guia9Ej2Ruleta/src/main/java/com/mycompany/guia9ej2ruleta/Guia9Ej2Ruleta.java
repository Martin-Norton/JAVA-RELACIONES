/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9ej2ruleta;

import Servicio.JuegoServicio;
import Servicio.JugadorServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia9Ej2Ruleta {

    public static void main(String[] args) {
        JuegoServicio js = new JuegoServicio();
        JugadorServicio jjs = new JugadorServicio();
        
        js.llenarJuego();
        jjs.disparo();
        js.ronda();
    }
}
