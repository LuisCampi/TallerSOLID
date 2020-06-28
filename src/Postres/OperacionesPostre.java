package Postres;

import Aderezo.Aderezo;

public class OperacionesPostre {
	
	public static void anadirAderezoPostre(Postre postre, Aderezo aderezos){
        postre.getAderezos().add(aderezos);
    }
    
    public static void quitarAderezoPostre(Postre postre, Aderezo aderezos){
        postre.getAderezos().remove(aderezos);
    }
    
}
