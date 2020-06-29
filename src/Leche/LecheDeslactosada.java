package Leche;

public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }

    @Override
    public void usarPastel() {
        // Lanzar error No se puede usar en pastel
        //throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
	System.out.println("Usando leche deslactosada");
    }
}