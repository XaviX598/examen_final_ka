package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Avion;

public interface IAvionRepository {
	
	public void insertar(Avion avion);
	
	public void actualizar(Avion avion);
	
	public void eliminar(Integer id);
	
	public Avion buscar(Integer id);

}
