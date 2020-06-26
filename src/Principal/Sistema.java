/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Postres.*;
import Postres.Postre.aderezos;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
    	System.out.println("HELADO POR CREAR");
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
    	
    	//LecheEntera leche = new LecheDeslactosada();
        //ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
    	//EN LUGAR DE ESCRIBIR TODAS ESAS LINEAS DE CODIGO, SE PUEDEN REDUCIR ESAS LINEAS A LA HORA DE CREAR UN NUEVO POSTRE
	    //Y A LA HORA DE AÑADIR UN ADEREZO. SE ELIMINÓ LA CLASE OperacionesAderezo Y SE MOVIERON SUS MÉTODOS A LA RENOVADA CLASE ADEREZO.
	    //ADEMÁS, SE CREA UNA NUEVA CLASE LLAMADA POSTRE, DE DONDE VAN A HEREDAR SUS ATRIBUTOS Y MÉTODOS LAS CLASES HELADO Y PASTEL.
	    //YA QUE PARA CADA UNO SE CREA UN ARRAYLIST DE ADEREZOS Y ADEMÁS COMPARTEN ATRIBUTOS COMO sabor Y precioParcial.
    	
    	// Producir Helado
        
    	
    	Postre helado_vainilla = new Helado("Vainilla");
    	Postre.anadirAderezoPostre(helado_vainilla, aderezos.FRUTILLA);
    	System.out.println(helado_vainilla);
    	System.out.println("HELADO CREADO");
        
    	/*
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());
       */
        
    }
}
