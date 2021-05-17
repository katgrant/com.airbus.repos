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

import com.airbus.pojos.Reservation;


@Repository
public class ReservationRepositoryImpl implements ReservationRepository {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		entityManager.persist(reserv);
	}

	@Transactional
	public Reservation findReservation(Integer tno) {
		// TODO Auto-generated method stub
		return entityManager.find(Reservation.class,tno);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Transactional
	public Set<Reservation> findReservations() {
		// TODO Auto-generated method stub
		Set<Reservation> reservSet;
		 Query query = entityManager.createQuery("from Reservation");
		
		reservSet = new HashSet(query.getResultList());
         
	        
		    return reservSet;
	}

	@Transactional
	public void modifyReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		entityManager.merge(reserv);
	}

	@Transactional
	public void removeReservation(Integer tno) {
		// TODO Auto-generated method stub
		Reservation reservTemp = entityManager.find(Reservation.class, tno);
		entityManager.remove(reservTemp);
	}

}
