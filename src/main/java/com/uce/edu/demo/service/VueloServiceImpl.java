package com.uce.edu.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.repository.IVueloRepository;

@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	private IVueloRepository iVueloRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.iVueloRepository.insertar(vuelo);
	}

	//PrimeraFuncionalidad
	@Override
    @Transactional(value = TxType.NOT_SUPPORTED)
    public List<Vuelo> buscarConDatos(String origen, String destino, String fecha) {
        return this.iVueloRepository.buscarConDatos(origen, destino, fecha);
    }
	
	

}
