package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.modelo.Vuelo;

public interface IVueloService {

	public void insertar(Vuelo vuelo);

	public List<Vuelo> buscarConDatos(String origen, String destino, String fechaVuelo);

}
