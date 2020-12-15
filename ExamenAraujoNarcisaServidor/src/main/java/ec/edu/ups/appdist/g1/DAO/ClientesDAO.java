package ec.edu.ups.appdist.g1.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdist.g1.modelo.Clientes;


public class ClientesDAO {

	@Inject
	private Connection conexion;
	
	@Inject
	private EntityManager em;
	
	@Inject
	private Clientes cliente;
	
	
	
	public ClientesDAO() {
		
		
	}
	public boolean insertJPA(Clientes cliente) throws SQLException {
		em.persist(cliente);
		
		return true;
	}
	public List<Clientes> listaClientes() {
		String jpql="Select c from Clientes c";
		Query q = em.createQuery(jpql,Clientes.class);
		return (List<Clientes>) q.getResultList();
	}
	
}
