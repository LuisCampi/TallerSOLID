package Postres;

import java.util.ArrayList;
import Procesos.*;

import Aderezo.Aderezo;
import Aderezo.*;

public class Postre {	
	
	public String sabor;
	public double precioParcial;
	public ArrayList<Aderezo> aderezos;
	    
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

		public void setAderezos(ArrayList<Aderezo> aderezos) {
			this.aderezos = aderezos;
		}

	    public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	    }

	    public static void anadirAderezoPostre(Postre postre, Aderezo aderezos){
	        postre.getAderezos().add(aderezos);
	    }
	    
	    public static void quitarAderezoPostre(Postre postre, Aderezo aderezos){
	        postre.getAderezos().remove(aderezos);
	    }
	    
}
