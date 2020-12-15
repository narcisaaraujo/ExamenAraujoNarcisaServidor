package ec.edu.ups.appdist.g1.on;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.appdist.g1.modelo.Clientes;


@Remote
public interface GestionClienteONRemoto {
	
	public boolean registrarCliente(Clientes cliente) throws Exception;
	public List<Clientes> listaClientes1();
}
