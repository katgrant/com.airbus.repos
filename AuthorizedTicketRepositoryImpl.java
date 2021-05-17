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


@Repository
public class AuthorizedTicketRepositoryImpl implements AuthorizedTicketRepository {
	@PersistenceContext

	EntityManager entityManager;
	@Transactional
	public void addAuthorizedTicket(AuthorizedTicket auth) {
		// TODO Auto-generated method stub
		entityManager.persist(auth);
	}

	@Transactional
	public AuthorizedTicket findAuthorizedTicket(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(AuthorizedTicket.class,id);
	}
@SuppressWarnings({ "unchecked", "rawtypes" })
	
	@Transactional
	public Set<AuthorizedTicket> findAuthorizedTickets() {
		Set<AuthorizedTicket> AuthTickSet;
		 Query query = entityManager.createQuery("from AuthorizedTicket");
			
			AuthTickSet = new HashSet(query.getResultList());
	         
		        
			    return AuthTickSet;
	}

	@Transactional
	public void modifyAuthorizedTicket(AuthorizedTicket auth) {
		// TODO Auto-generated method stub
		entityManager.merge(auth);
	}

	@Transactional
	public void removeAuthorizedTicket(Integer id) {
		// TODO Auto-generated method stub
		AuthorizedTicket aTemp = entityManager.find(AuthorizedTicket.class,id);
		entityManager.remove(aTemp);
	}



}