import java.util.ArrayList;

public class Barco implements Objetivo{

	// Atributos ( 4 )
	
	private ArrayList<Pirata> tripulantes = new ArrayList<Pirata>();
	
	public Mision mision;
	private int monedas = 0;
	private int dineroTotal = 0;
	
	// Getters y Setters ( 3 )
	
	public int getPoblacion(){
		return tripulantes.size();
	}
	
	public int getMonedas(){
		for(Pirata unPirata: tripulantes){
			dineroTotal = dineroTotal + unPirata.getDinero();
			}	
		return dineroTotal + monedas;
	}
	
	public void setMonedas (int Monedas){
		monedas = Monedas;
	}
	
	// Metodos Tripulante ( 3 )
	
	public void asignarTripulante(Pirata unPirata) {
		tripulantes.add(unPirata);
	}
	
	public boolean tripulanteAprobado(Pirata unPirata){
		return mision.Requisitos(unPirata, this);
	}
	
	public void subirTripulante(Pirata unPirata){
		if (unPirata.puedeSubir(this)) {
			this.asignarTripulante(unPirata);
		}
	}
	
	// Metodos Mision ( 2 )
	
	public void asignarMision(Mision unaMision) {
		mision = unaMision;
	}
	
	public void cambiarMision(Mision unaMision){
		mision = unaMision;
	}
	
	// Otros Metodos ( 2 )
	
	public boolean estaPirata(Pirata unPirata){
		return this.tripulantes.contains(unPirata);
	}
	

}
