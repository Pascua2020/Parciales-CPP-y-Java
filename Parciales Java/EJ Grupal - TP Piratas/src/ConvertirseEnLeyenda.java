public class ConvertirseEnLeyenda implements Mision{
	
	public boolean Requisitos(Pirata unPirata,Objetivo unObjetivo) {
		return unPirata.cantidadItem() > 9;
	}
}
