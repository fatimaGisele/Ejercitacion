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
public class ServicioArmado extends Servicio {
    private static final int PRECIO_HORA = 250;

    public ServicioArmado(int cantHoras) {
        super(cantHoras);
    }
    
    public double monto() {
        double total = super.getCantHoras() * PRECIO_HORA;
        return Matematica.sumarPorcentaje(total, Facturable.IVA_PORC);
    }

   
    
}
