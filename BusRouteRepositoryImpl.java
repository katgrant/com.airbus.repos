package com.airbus.repos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airbus.pojos.BusRoute;
import com.airbus.pojos.Buses;

@Repository
public class BusRouteRepositoryImpl implements BusRouteRepository {

	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addBusRoute(BusRoute bRou) {
		// TODO Auto-generated method stub
		entityManager.persist(bRou);
	}

	@Transactional
	public BusRoute findBusRoute(Integer rno) {
		// TODO Auto-generated method stub
		System.out.println("find Busroute");
		return entityManager.find(BusRoute.class, rno);
	}

	@Transactional
	public Set<BusRoute> findBusRoutes() {
		// TODO Auto-generated method stub
		Set<BusRoute> busRouteSet;
        Query query = entityManager.createQuery("from BusRoute");
        
        busRouteSet = new HashSet(query.getResultList());
   
    return busRouteSet;
	}

	@Transactional
	public void modifyBusRoute(BusRoute bRou) {
		// TODO Auto-generated method stub
		entityManager.merge(bRou);
	}

	@Override
	public void removeBusRoute(Integer rno) {
		// TODO Auto-generated method stub
		BusRoute brTemp=  entityManager.find(BusRoute.class, rno);
	}

}
