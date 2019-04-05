package com.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.springboot.app.models.entity.Cliente;

@Repository("clienteDaoImpl")
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")	
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
	}

	@Override	
	public void save(Cliente cliente) {
		if (cliente.getId() != null)
			em.merge(cliente);
		else
			em.persist(cliente);
	}

	public Cliente finOne(Long id) {
		return em.find(Cliente.class, id);
	}

	public void delete(Long id) {
		em.remove(finOne(id));
	}

}
