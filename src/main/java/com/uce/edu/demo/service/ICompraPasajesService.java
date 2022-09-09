package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Vuelo;

public interface ICompraPasajesService {
	
	public void reservarPasajes(Vuelo v, Integer cantidadAsientos, String tarjeta);

}
