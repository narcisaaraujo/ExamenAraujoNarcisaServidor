package ec.edu.ups.appdist.g1.on;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdist.g1.DAO.ClientesDAO;
import ec.edu.ups.appdist.g1.modelo.Clientes;



@Stateless
public class GestionClientesON implements GestionClienteONRemoto{
	@Inject
	private ClientesDAO clienteDAO;
	
	
	public boolean registrarCliente(Clientes cliente) throws Exception {
		clienteDAO.insertJPA(cliente);
		
		return true;
	}

}
