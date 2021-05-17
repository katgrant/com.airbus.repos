package com.airbus.repos;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airbus.pojos.Reservation;

@Repository
public interface ReservationRepository {
	
	void addReservation (Reservation reserv);
	Reservation findReservation(Integer tno);
	Set<Reservation> findReservations();
	void modifyReservation(Reservation reserv);
	void removeReservation(Integer tno);
}
