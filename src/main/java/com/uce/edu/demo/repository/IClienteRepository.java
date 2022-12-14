package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Cliente;

public interface IClienteRepository {
	
	public void insertar(Cliente cliente);
	
	public void actualizar(Cliente cliente);
	
	public void eliminar(Integer id);
	
	public Cliente buscar(Integer id);

}
