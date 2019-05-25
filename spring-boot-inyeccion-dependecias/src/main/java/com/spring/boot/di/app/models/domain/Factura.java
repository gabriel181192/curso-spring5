package com.spring.boot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;
	
	@Autowired
	@Qualifier("itemFacturasOficina")
	private List<ItemFactura> itemFactura;

	public String getDescripcion() {
		return descripcion;
	}
	
	/*Ciclo de vida de los componentes*/
	@PostConstruct	
	public void inicializar() {
		cliente.setNombre("Pero y Pablo".concat(" ").concat(cliente.getNombre() ));
	}

	@PreDestroy
	public void destruir() {
		System.out.println("Antes de destruir el objeto");
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItemFactura() {
		return itemFactura;
	}

	public void setItemFactura(List<ItemFactura> itemFactura) {
		this.itemFactura = itemFactura;
	}

}
