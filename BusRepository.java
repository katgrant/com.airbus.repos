package com.airbus.repos;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airbus.pojos.Buses;


@Repository
public interface BusRepository {
	
	void addBus(Buses bus);
	Buses findBus(Integer bno);
	Set<Buses> findBuses();
	void modifyBus(Buses bus);
	void removeBus(Integer bno);
}
