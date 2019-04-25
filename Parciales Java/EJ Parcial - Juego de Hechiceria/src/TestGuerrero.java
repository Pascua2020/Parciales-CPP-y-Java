import junit.framework.TestCase;

public class TestGuerrero extends TestCase{

public Guerrero Aragon = new Guerrero();
public Espada sable = new Espada();
public CollarDivino collarOro = new CollarDivino();

public void setUp(){
sable.setNivelDeLucha(30);
collarOro.setCantPerlas(30);
}

public void testNivelDeLucha(){

Aragon.setArtefacto(sable);
Aragon.setArtefacto(collarOro);

assertTrue( Aragon.getNivelDeLuchaG()==60);
}
}