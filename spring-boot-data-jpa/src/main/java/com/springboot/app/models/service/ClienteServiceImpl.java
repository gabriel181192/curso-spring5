package com.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.dao.IClienteRepositoryDao;
import com.springboot.app.models.entity.Cliente;

@Service("clienteService")
public class ClienteServiceImpl implements IClienteService {

	@Autowired 
	IClienteRepositoryDao clienteDao; //Con la implementacion de Spring Data
	
	//IClienteDao clienteDao; Sin la implementacion de Spring Data
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente finOne(Long id) {
		return clienteDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.delete(id);
	}

}
