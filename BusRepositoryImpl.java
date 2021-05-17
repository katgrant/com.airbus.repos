package com.airbus.repos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airbus.pojos.Buses;


@Repository
public class BusRepositoryImpl implements BusRepository {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addBus(Buses bus) {
		// TODO Auto-generated method stub
		entityManager.persist(bus);
	}

	@Transactional
	public Buses findBus(Integer bno) {
		// TODO Auto-generated method stub
		return entityManager.find(Buses.class,bno);
	}

	@Transactional
	public Set<Buses> findBuses() {
		Set<Buses> busSet;
        Query query = entityManager.createQuery("from Buses");
        
        busSet = new HashSet(query.getResultList());
   
    return busSet;
    }

	@Transactional
	public void modifyBus(Buses bus) {
		// TODO Auto-generated method stub
		entityManager.merge(bus);
	}

	@Transactional
	public void removeBus(Integer bno) {
		// TODO Auto-generated method stub
		Buses bTemp = entityManager.find(Buses.class,bno);
		entityManager.remove(bTemp);
	}

}
