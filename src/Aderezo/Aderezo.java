package Aderezo;

public abstract class Aderezo {
		
	public String nombre;
	
	abstract public void setNombre();

	@Override
    public String toString() {
		return "sabor= " + nombre.toUpperCase();
    }
}




