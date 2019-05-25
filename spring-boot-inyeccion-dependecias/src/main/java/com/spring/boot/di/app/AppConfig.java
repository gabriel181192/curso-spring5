package com.spring.boot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.boot.di.app.models.domain.ItemFactura;
import com.spring.boot.di.app.models.domain.Producto;
import com.spring.boot.di.app.models.service.IMiServicio;
import com.spring.boot.di.app.models.service.MiServicio;
import com.spring.boot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IMiServicio registrarMiServicioSimple() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemFacturas")	
	public List<ItemFactura> registrarItemsFactura(){
		Producto producto1 = new Producto("Jabo", 25.10F);
		Producto producto2 = new Producto("Papel", 30.00F);
		Producto producto3 = new Producto("Playera", 310F);
		Producto producto4 = new Producto("Celular", 12000F);
		Producto producto5 = new Producto("Camisa", 500.50F);
		
		ItemFactura itemFactura1 = new ItemFactura(producto1, 20);
		ItemFactura itemFactura2 = new ItemFactura(producto2, 10);
		ItemFactura itemFactura3 = new ItemFactura(producto3, 5);
		ItemFactura itemFactura4 = new ItemFactura(producto4, 80);
		ItemFactura itemFactura5 = new ItemFactura(producto5, 75);
		
		List<ItemFactura> itemFacturas = Arrays.asList(itemFactura1,itemFactura2,itemFactura3,itemFactura4,itemFactura5);
		
		return itemFacturas;
		
	}
	
	
	@Bean("itemFacturasOficina")	
	public List<ItemFactura> registrarItemsFacturaOficina(){
		Producto producto1 = new Producto("Monitor", 1800.10F);
		Producto producto2 = new Producto("Postik", 30.00F);
		Producto producto3 = new Producto("CPU", 500F);
		Producto producto4 = new Producto("Silla", 1300F);
		Producto producto5 = new Producto("Mesa", 5000.50F);
		
		ItemFactura itemFactura1 = new ItemFactura(producto1, 14);
		ItemFactura itemFactura2 = new ItemFactura(producto2, 5);
		ItemFactura itemFactura3 = new ItemFactura(producto3, 60);
		ItemFactura itemFactura4 = new ItemFactura(producto4, 2);
		ItemFactura itemFactura5 = new ItemFactura(producto5, 21);
		
		List<ItemFactura> itemFacturas = Arrays.asList(itemFactura1,itemFactura2,itemFactura3,itemFactura4,itemFactura5);
		
		return itemFacturas;
		
	}
}
