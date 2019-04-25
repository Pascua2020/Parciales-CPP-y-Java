import junit.framework.TestCase;
public class TestCliente extends TestCase{

	private CentroSalud caballito = new CentroSalud();
	private Cliente juan = new Cliente();
	private HierbaVerde marcaVerde = new HierbaVerde();
	
	public void setUp() {
		caballito.asignarPersona(juan);
		juan.setPeso(100);
		juan.setVitalidad(100);
		juan.setEnvejecimiento(4);
	}
	
	public void testTomarMed() {
		juan.consumirMed(marcaVerde);
		assertTrue(juan.getVitalidad()==105 && juan.getPeso()==90);
	}
}
