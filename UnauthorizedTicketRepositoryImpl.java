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

import com.airbus.pojos.AuthorizedTicket;
import com.airbus.pojos.UnauthorizedTicket;
@Repository
public class UnauthorizedTicketRepositoryImpl implements UnauthorizedTicketRepository {
	@PersistenceContext

	EntityManager entityManager;
	@Transactional
	public void addUnauthorizedTicket(UnauthorizedTicket unauth) {
		// TODO Auto-generated method stub
		entityManager.persist(unauth);
	}

	@Transactional
	public UnauthorizedTicket findUnauthorizedTicket(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(UnauthorizedTicket.class,id);
	}
@SuppressWarnings({ "unchecked", "rawtypes" })
	
	@Transactional
	public Set<UnauthorizedTicket> findUnauthorizedTickets() {
		Set<UnauthorizedTicket> UnauthTickSet;
		 Query query = entityManager.createQuery("from UnauthorizedTicket");
			
			UnauthTickSet = new HashSet(query.getResultList());
	         
		        
			    return UnauthTickSet;
	}
	

	@Transactional
	public void modifyUnauthorizedTicket(UnauthorizedTicket unauth) {
		// TODO Auto-generated method stub
		entityManager.merge(unauth);
	}

	
	

	@Transactional
	public void removeUnauthorzsedTicket(Integer id) {
		// TODO Auto-generated method stub
		UnauthorizedTicket aTemp = entityManager.find(UnauthorizedTicket.class,id);
		entityManager.remove(aTemp);
	}

	

}