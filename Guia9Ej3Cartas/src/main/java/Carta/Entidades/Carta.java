/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carta.Entidades;

import Carta.Enum.PaloEnum;

/**
 *
 * @author Martin Norton
 */
public class Carta {
    private Integer numero;
    private PaloEnum palo;

    public Carta() {
    }

    public Carta(Integer numero, PaloEnum palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public PaloEnum getPalo() {
        return palo;
    }

    public void setPalo(PaloEnum palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " " + palo ;
    }
    
}
