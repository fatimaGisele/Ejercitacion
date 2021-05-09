/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia01;

/**
 *
 * @author Usuario
 */
public abstract class Servicio implements Facturable{
    private int cantHoras;

    public Servicio(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
    public abstract double monto();

    public int getCantHoras() {
        return cantHoras;
    }
    
}
