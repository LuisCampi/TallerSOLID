package Postres;

import java.util.ArrayList;


public class Postre {
	
	public static enum aderezos {
	    MALVAVISCOS,
	    FRUTILLA,
	    CREMA
	}
	
	public String sabor;
	public static double precioParcial;
	public static ArrayList<aderezos> aderezos;
	    
	    public Postre(String sabor) {
		this.sabor = sabor;
		this.precioParcial = precioParcial;
		this.aderezos = aderezos;
	    }
	    
		public String getSabor() {
			return sabor;
		}

		public void setSabor(String sabor) {
			this.sabor = sabor;
		}

		public double getPrecioParcial() {
			return precioParcial;
		}

		public void setPrecioParcial(double precioParcial) {
			this.precioParcial = precioParcial;
		}

		public void setAderezos(ArrayList<aderezos> aderezos) {
			this.aderezos = aderezos;
		}

	    public ArrayList<aderezos> getAderezos() {
	        return aderezos;
	    }

	    
	// ESTE ES UN ARCHIVO EL CUAL POSEE POCO CODIGO, DONDE SE ESTABLECEN LOS ADEREZOS COMO CONSTANTES.
	//SIN EMBARGO, HAY UNA CLASE LLAMADA OperacionesAderezo CON VARIOS METODOS, LOS CUALES PUEDEN IR DENTRO DE ESTE ARCHIVO
	  
	    public static void anadirAderezoPostre(Postre postre, aderezos aderezo){
	        postre.getAderezos().add(aderezo);
	    }
	    
	    public static void quitarAderezoPostre(Postre postre, Postre aderezos){
	        postre.getAderezos().remove(aderezos);
	    }

}
