public class Saqueo implements Mision{
	
	private int minimoMonedas;
	private Objetivo victima;
	
	// Set

	public void setMinimoMonedas(int minimo){
		minimoMonedas = minimo;
	}
	
	public void setVictima(Objetivo unObjetivo){
		victima = unObjetivo;
	}
	// Requisitos
	
	public boolean Requisitos(Pirata unPirata, Objetivo unObjetivo) {
		return (unPirata.getDinero() < minimoMonedas) && victima.getPoblacion() < (unObjetivo.getPoblacion() * 0.30);
	}

}
