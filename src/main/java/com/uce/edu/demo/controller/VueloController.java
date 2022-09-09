package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelos")
public class VueloController {
	
	@Autowired
	private IVueloService iVueloService;
	
	//Vuelos disponibles
	@GetMapping("/buscar")
	public String buscarVuelosDis(Vuelo vuelo, Model modelo) {
		System.out.println(vuelo);
		List<Vuelo> listaVuelos = this.iVueloService.buscarConDatos(vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFechaVuelo());
		modelo.addAttribute("vuelos", listaVuelos);
		System.out.println(listaVuelos.size());
		return "vistaListaVuelos";
		
	}
	
	@GetMapping("/buscarVuelo")
    public String buscarVuelo(Vuelo vuelo) {
        return "vistaBusquedaVuelos";
    }

}
