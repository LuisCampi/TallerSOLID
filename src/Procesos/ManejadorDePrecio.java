package Procesos;
import Postres.*;


public class ManejadorDePrecio {
	
	   
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(Postre.precioParcial+(Postre.precioParcial*0.12))+(Postre.aderezos.size()*0.50);
        return precioFinal;
    }
    
	
	public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
	

}
