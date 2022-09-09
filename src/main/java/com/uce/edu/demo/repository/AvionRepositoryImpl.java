package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Avion;

@Repository
@Transactional
public class AvionRepositoryImpl implements IAvionRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(avion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Avion av = this.buscar(id);
		this.entityManager.remove(av);
	}

	@Override
	public Avion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Avion.class, id);
	}
	
	

}
