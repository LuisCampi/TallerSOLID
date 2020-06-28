package Procesos;

import Postres.*;


public class ManejadorDePrecio {
	
    public double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.precioParcial+(postre.precioParcial*0.12))+(postre.aderezos.size()*0.50);
        return precioFinal;
    }
    
	
	public String showPrecioFinal(Postre postre){
		return "Precio Final: $ " + calcularPrecioFinal(postre);
    }	
}