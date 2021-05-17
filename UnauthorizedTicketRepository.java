package com.airbus.repos;


import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airbus.pojos.UnauthorizedTicket;
@Repository
public interface UnauthorizedTicketRepository {
	
	void addUnauthorizedTicket( UnauthorizedTicket unauth);
	 UnauthorizedTicket findUnauthorizedTicket(Integer id);
	Set< UnauthorizedTicket> findUnauthorizedTickets();
	void modifyUnauthorizedTicket( UnauthorizedTicket unauth);
	void removeUnauthorzsedTicket(Integer id);
}