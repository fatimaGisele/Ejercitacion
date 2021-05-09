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
public class ServicioReparacion extends Servicio{
    private static final int PRECIO_HORA = 180;
    private static final double PORC_INCREMENTO = 0.25;
    private int nivelDificultad;

    public ServicioReparacion(int nivelDificultad, int cantHoras) {
        super(cantHoras);
        this.nivelDificultad = nivelDificultad;
    }
    
    
    public double monto() {
        double total = this.nivelDificultad<= 3 ? subtotal() : subTotalIncremento();
        return total ;
    }
    
    public double subtotal(){
        double subtotal = PRECIO_HORA * super.getCantHoras();
        return Matematica.sumarPorcentaje(subtotal, Facturable.IVA_PORC);
    }
    
    public double subTotalIncremento(){
        double subTotalIncremento = Matematica.sumarPorcentaje(subtotal(), PORC_INCREMENTO);
        return Matematica.sumarPorcentaje(subTotalIncremento, Facturable.IVA_PORC);
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }
    
}
