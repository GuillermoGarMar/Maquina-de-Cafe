/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadec;

/**
 *
 * @author ggarciamartinez
 */
public class Cafe {
    private final int valor=1;
    private int cantAzr;

    public Cafe() {
    }

    public Cafe(int cantAzr) {
        this.cantAzr = cantAzr;
    }

    public int getValor() {
        return valor;
    }

    public int getCantAzr() {
        return cantAzr;
    }

    public void setCantAzr(int cantAzr) {
        this.cantAzr = cantAzr;
    }
    
}
