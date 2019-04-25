import java.util.ArrayList;

public class Guerrero{

private ArrayList <Artefacto> artefactos = new ArrayList();

public void setArtefacto ( Artefacto unArtefacto ){
	this.artefactos.add(unArtefacto);
}

// Punto 2

public int getNivelDeLuchaG(){
int total=0;
	for ( Artefacto unArtefacto : artefactos ){
		total = total + unArtefacto.getNivelDeLucha();
						}
			return total;
			}

// Punto 1
public int getCantArtefactos(){
	return this.artefactos.size();
				}
}
