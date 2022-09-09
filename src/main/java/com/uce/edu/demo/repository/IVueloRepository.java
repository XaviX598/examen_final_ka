package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.modelo.Vuelo;

public interface IVueloRepository {
	
	public void insertar(Vuelo vuelo);
	
	public List<Vuelo> buscarConDatos(String origen, String destino, String fechaVuelo);
	
	public void actualizar(Vuelo vuelo);
	
	public void eliminar(Integer id);
	
	public Vuelo buscar(Integer id);

}
