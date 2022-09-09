package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Vuelo> buscarConDatos(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub 
		Query myNamedQuery = this.entityManager.createNamedQuery("Vuelo.buscarConDatos");
        myNamedQuery.setParameter("origen", origen);
        myNamedQuery.setParameter("destino", destino);
        myNamedQuery.setParameter("fecha", fechaVuelo);
        return myNamedQuery.getResultList();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Vuelo v= this.buscar(id);
		this.entityManager.remove(v);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

}
