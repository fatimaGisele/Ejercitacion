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
public class Insumo implements Facturable{
    private String nombre;
    private Tipo tipo;
    private static final double PORC_GANANCIA = 0.3;
    private double precioLista;
    
    public Insumo(String nombre, Tipo tipo, double precioLista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioLista = precioLista;
    }

    @Override
    public double monto() {
        double total = this.precioLista + this.precioLista*PORC_GANANCIA;
        return Matematica.sumarPorcentaje(total,Facturable.IVA_PORC);
    }

    
    
}
