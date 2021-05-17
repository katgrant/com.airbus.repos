package com.airbus.repos;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airbus.pojos.AuthorizedTicket;

@Repository
public interface AuthorizedTicketRepository {
	
	void addAuthorizedTicket(AuthorizedTicket auth);
	AuthorizedTicket findAuthorizedTicket(Integer id);
	Set<AuthorizedTicket> findAuthorizedTickets();
	void modifyAuthorizedTicket(AuthorizedTicket auth);
	void removeAuthorizedTicket(Integer id);
}