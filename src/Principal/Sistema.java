/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Postres.*;
import Procesos.*;
import Aderezo.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
	
    public static void main(String [ ] args){

        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
    	
        
    	//EN LUGAR DE ESCRIBIR TODAS ESAS LINEAS DE CODIGO, SE PUEDEN REDUCIR ESAS LINEAS A LA HORA DE CREAR UN NUEVO POSTRE
	    //Y A LA HORA DE AÑADIR UN ADEREZO. 
    	//SE ELIMINÓ LA CLASE OperacionesAderezo Y SE MOVIERON SUS MÉTODOS A LA RENOVADA CLASE ADEREZO.
	    //ADEMÁS, SE CREA UNA NUEVA CLASE LLAMADA POSTRE, DE DONDE VAN A HEREDAR SUS ATRIBUTOS Y MÉTODOS LAS CLASES HELADO Y PASTEL.
	    //YA QUE PARA CADA UNO SE CREA UN ARRAYLIST DE ADEREZOS Y ADEMÁS COMPARTEN ATRIBUTOS COMO sabor Y precioParcial.
    
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDePrecio mnj_precio = new ManejadorDePrecio();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        //Producir Helado
    	Postre helado_vainilla = new Helado("Vainilla");
    	arrPostres.add(helado_vainilla);
    	
    	//Producir Pastel
    	Postre pastel_chocolate = new Pastel("Chocolate");
    	arrPostres.add(pastel_chocolate);
    	
    	//Añadir aderezos tanto al helado como al pastel
    	Aderezo aderezo_crema = new Crema();
    	aderezo_crema.setNombre();
    	Aderezo aderezo_frutilla = new Frutilla();
    	aderezo_frutilla.setNombre();
		Postre.anadirAderezoPostre(helado_vainilla, aderezo_crema);
		Postre.anadirAderezoPostre(helado_vainilla, aderezo_frutilla);
		Postre.anadirAderezoPostre(pastel_chocolate, aderezo_crema);
		Postre.anadirAderezoPostre(pastel_chocolate, aderezo_frutilla);
		System.out.println(arrPostres);
		
        //mnj_leche.cambiarTipoLeche(new LecheDeslactosada(), helado_vainilla);
		mnj_leche.cambiarTipoLeche(new LecheDescremada(), helado_vainilla);
        
    }
}
