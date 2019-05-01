import java.util.ArrayList;

public class Pirata {
	
	// Atributos ( 3 )
	
	private int edad;
	private int dinero;
	
	private ArrayList<String> items = new ArrayList<String>();

	// Getters y Setters ( 4 )
	
	public void setEdad (int Edad){
		edad = Edad;
	}
	
	public int getEdad (){
		return edad;
	}
	
	public void setDinero (int Dinero){
		dinero = Dinero;
	}
	
	public int getDinero (){
		return dinero;
	}

	// Metodos Items ( 3 )
	
	public void agregarItem(String item) {
		this.items.add(item);
	}
	
	public boolean estaItem (){
		return this.items.contains("GROGXD") || this.items.contains("BRUJULA");
	}
	
	public int cantidadItem (){
		return this.items.size();
	}
	
	// Metodo Subir
	
	public boolean puedeSubir(Barco unBarco) {
		return unBarco.mision.Requisitos(this, unBarco);
	}
	
}
