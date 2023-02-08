/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Martin Norton
 */
public class Revolver {
    Random ran = new Random();
    Integer posAct;
    Integer posAgua;

    public Revolver() {
    }

    public Revolver(Integer posAct, Integer posAgua) {
        this.posAct = posAct;
        this.posAgua = posAgua;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    public Integer getPosAct() {
        return posAct;
    }

    public void setPosAct(Integer posAct) {
        this.posAct = posAct;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posAct=" + posAct + ", posAgua=" + posAgua + '}';
    }
    
    
}
