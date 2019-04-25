import java.util.ArrayList;
public class CentroSalud {
	
	private ArrayList <Cliente> clientes = new ArrayList <Cliente>();
	
	public void asignarPersona(Cliente unCliente) {
		this.clientes.add(unCliente);
	}
	
	public int personasAtendidas() {
		return this.clientes.size();
	}

}
