
public class HierbaMilagrosa implements Medicamento{
	
	public void efecto( Cliente c) {
		double e = ( c.getEnvejecimiento() * 70) % 100;
	}

}
