
public class Alcachofa implements Medicamento{
	
	public void efecto( Cliente c) {
		
		double p = ( c.getPeso() * 80) % 100;
		
	}

}
