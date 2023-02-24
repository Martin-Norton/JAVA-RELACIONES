/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9ej3cartas;

import Carta.Service.CartaServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia9Ej3Cartas {

    public static void main(String[] args) {
        CartaServicio cs = new CartaServicio();
        cs.generarBaraja();
        cs.mostrarBaraja();
    }
}
