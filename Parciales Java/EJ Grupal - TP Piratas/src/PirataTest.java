import junit.framework.TestCase;

public class PirataTest extends TestCase {
	
	// Objetos Barco / Costa
	
	private Barco fragata = new Barco();
	private Costa salguero = new Costa();
	
	// Objetos Pirata
	
	private Pirata barbanegra = new Pirata();
	private Pirata barbagris = new Pirata();
	private Pirata barbaroja = new Pirata();
	private Pirata jack = new Pirata();
	private Pirata morgan = new Pirata();
	
	// Objetos Misiones
	
	private ConvertirseEnLeyenda leyenda = new ConvertirseEnLeyenda();
	private BusquedaDelTesoro tesoro = new BusquedaDelTesoro();
	private Saqueo elSaqueo = new Saqueo();
	
	public void setUp(){
		// pirata 1
		barbanegra.setEdad(40);
		
		barbanegra.agregarItem("BRUJULA");
		barbanegra.agregarItem("GROGXD");
		barbanegra.agregarItem("DIENTE DE ORO");
		
		barbanegra.setDinero(500);
		
		// pirata 2
		barbaroja.setDinero(1);
		barbaroja.agregarItem("Manaos");
		
		// barco
		fragata.asignarMision(tesoro);
		
		fragata.asignarTripulante(barbaroja);
		fragata.asignarTripulante(jack);
		fragata.asignarTripulante(morgan);
		
		// costa
		salguero.setPoblacion(1);
	}
	
	// Metodos Punto 1 ( Saber si pirata es util para mision )
	
	// Util en "Busqueda del Tesoro"
	public void testUtilMisionBusquedaTesoro(){
		
		fragata.asignarTripulante(barbanegra);
		
		assertTrue(barbanegra.puedeSubir(fragata));
	}
	
	// Util en "Convertirse en Leyenda"
	public void testUtilMisionLeyenda(){
		
		fragata.asignarMision(leyenda);
		
		barbanegra.agregarItem("DIENTE DE ORO");
		barbanegra.agregarItem("CUCHILLO");
		barbanegra.agregarItem("CUCHILLO");
		barbanegra.agregarItem("PATA DE PALO");
		barbanegra.agregarItem("LORO");
		barbanegra.agregarItem("GARFIO");
		barbanegra.agregarItem("SOMBRERO");
		barbanegra.agregarItem("PARCHE");
		
		assertTrue(barbanegra.puedeSubir(fragata));
	}
	
	// Util en "Saqueo"
	public void testUtilMisionSaqueo(){
		
		fragata.asignarMision(elSaqueo);
		elSaqueo.setMinimoMonedas(50);
		elSaqueo.setVictima(salguero);
		salguero.setPoblacion(1);
		barbanegra.setDinero(40);
		fragata.asignarTripulante(barbagris);
		
		assertTrue(barbanegra.puedeSubir(fragata));
	}
	
	// Metodos Punto 2 ( Hacer que un pirata se suba a un barco )
	
	public void testSubirTripulante(){
		fragata.subirTripulante(barbanegra);
		assertTrue(fragata.estaPirata(barbanegra));
	}
	
	public void testNoSubirTripulante(){
		fragata.asignarMision(leyenda);
		fragata.subirTripulante(barbanegra);
		
		assertFalse(fragata.estaPirata(barbanegra));
	}
	
	// Metodo Punto 3 ( Saber cantidad de piratas que tiene un barco )
	
	public void testCantidadPiratas(){
		assertTrue (fragata.getPoblacion() == 3);
	}
	
	// Metodo Punto 4 ( Conocer cantidad de dinero que lleva un barco )
	
	public void testDineroTotalBarco(){
		
		fragata.setMonedas(500);
		
		barbaroja.setDinero(150);
		jack.setDinero(150);
		morgan.setDinero(150);
		
		assertTrue(fragata.getMonedas()== 950);
	}
}
