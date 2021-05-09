/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia01;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Comercio {
    private ArrayList<Facturable> facturable;

    public Comercio() {
        this.facturable = new ArrayList<>();
    }
    
    public void agregarFacturable(Facturable f){
        this.facturable.add(f);
    }
    
    public double montoTotalFacturado(){
        double montoTotal = 0;
        for(Facturable f: facturable){
            montoTotal += f.monto();
        }
        return montoTotal;
    }
    
    public int cantServiciosSimple(){
        int c=0;
        for(Facturable f: facturable){
            if(f instanceof ServicioReparacion){
                if(((ServicioReparacion) f).getNivelDificultad()< 2){
                    c++;
                }
            }
        }
        return c;
    }
}
