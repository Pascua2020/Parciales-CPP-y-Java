public class MascaraOscura implements Artefacto{
	private int nivelDeOscuridad;

	public void setNivelDeOscuridad ( int unValor ) {
		nivelDeOscuridad = unValor;
				}

	public int getNivelDeLucha(){
		return nivelDeOscuridad * 2;
				}
}