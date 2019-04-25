
public class Cliente {
	
	private double peso;
	private double vitalidad;
	private double envejecimientoNV;
	
	public void consumirMed(Medicamento unM) {
		unM.efecto(this);
	}
	
	public void setPeso(double p) {
		peso = p;
	}
	
	public void setVitalidad(double v) {
		vitalidad = v;
	}
	
	public void setEnvejecimiento(double e) {
		envejecimientoNV = e;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getVitalidad() {
		return vitalidad;
	}
	
	public double getEnvejecimiento() {
		return envejecimientoNV;
	}

}
