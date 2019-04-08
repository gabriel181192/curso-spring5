package com.springboot.app.util.paginator;

import org.springframework.data.domain.Page;

public class PageRender<T> {
	
	private String url;
	private Page<T> page;
	
	private int totalPaginas;
	private int numeroPorPaginas;
	
	
	public PageRender(String url, Page<T> page) {
		super();
		this.url = url;
		this.page = page;
		
		numeroPorPaginas = page.getSize();
		totalPaginas = page.getTotalPages();
	}
	
	

}
