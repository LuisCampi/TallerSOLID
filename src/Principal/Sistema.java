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
    
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDePrecio mnj_precio = new ManejadorDePrecio();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        //Producir Helado
    	Postre helado_vainilla = new Helado("Vainilla");
    	arrPostres.add(helado_vainilla);
    	System.out.println(helado_vainilla);
    	
    	//Producir Pastel
    	Postre pastel_chocolate = new Pastel("Chocolate");
    	arrPostres.add(pastel_chocolate);
    	System.out.println(pastel_chocolate);
    	
    	//Añadir aderezos tanto al helado como al pastel
    	Aderezo aderezo_crema = new Crema();
    	aderezo_crema.setNombre();
    	Aderezo aderezo_frutilla = new Frutilla();
    	aderezo_frutilla.setNombre();
		Postre.anadirAderezoPostre(helado_vainilla, aderezo_crema);
		Postre.anadirAderezoPostre(helado_vainilla, aderezo_frutilla);
		System.out.println(helado_vainilla);
		Postre.anadirAderezoPostre(pastel_chocolate, aderezo_frutilla);
		Postre.anadirAderezoPostre(pastel_chocolate, aderezo_crema);
		System.out.println(pastel_chocolate);
		
		//Mostrar el precio final de cada postre
		System.out.println(mnj_precio.showPrecioFinal(helado_vainilla));
		System.out.println(mnj_precio.showPrecioFinal(pastel_chocolate));
		
		//Mostar el arreglo final
		System.out.println(arrPostres);
		
        mnj_leche.cambiarTipoLeche(new LecheDeslactosada(), helado_vainilla);
		//mnj_leche.cambiarTipoLeche(new LecheDescremada(), helado_vainilla);
        
    }
}
