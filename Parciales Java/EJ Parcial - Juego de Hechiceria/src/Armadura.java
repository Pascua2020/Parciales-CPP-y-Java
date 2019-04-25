public class Armadura implements Artefacto{
	private int cantPiezas;

	public void setCantPiezas ( int unValor ) {
		cantPiezas = unValor;
				}

	public int getNivelDeLucha(){
		return 10 + ( cantPiezas / 2 );
				}
}