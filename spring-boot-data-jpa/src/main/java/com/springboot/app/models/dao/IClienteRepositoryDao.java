package com.springboot.app.models.dao;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.app.models.entity.Cliente;

public interface IClienteRepositoryDao  extends PagingAndSortingRepository<Cliente, Long>{
	//Spring Data
}
