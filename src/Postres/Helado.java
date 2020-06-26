/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
	
    public Helado(String sabor) {
		super(sabor);
		// TODO Auto-generated constructor stub
		aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 7.85;
	}
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
}
