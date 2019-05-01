public class BusquedaDelTesoro implements Mision{
	
	public boolean Requisitos(Pirata unPirata,Objetivo unObjetivo) {
		return unPirata.estaItem() && unPirata.getEdad() < 60;
	}
	
}
