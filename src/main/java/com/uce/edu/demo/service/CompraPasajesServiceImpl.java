package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.CompraPasaje;
import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.repository.ICompraPasajeRepository;

@Service
public class CompraPasajesServiceImpl implements ICompraPasajesService{
	
	@Autowired
	private ICompraPasajeRepository iCompraPasajeRepository;

	@Override
	public void reservarPasajes(Vuelo v, Integer cantidadAsientos, String tarjeta) {
		// TODO Auto-generated method stub
		
		List<CompraPasaje> lista = new ArrayList<>();
		
		CompraPasaje c = new CompraPasaje();
		
		c.setEstado("RES");
		c.setFechaCompra(LocalDateTime.now());
		c.setNumero(tarjeta);
		c.setVuelo(v);
		
		if(v.getAsientosDisponibles()> cantidadAsientos) {
			
		}
		
		
	}

}
