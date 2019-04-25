
public class HierbaVerde implements Medicamento{
	
	public void efecto( Cliente c) {
		double p = ( c.getPeso() * 90) % 100;
		double v = c.getVitalidad();
		v+=5;
	}

}
