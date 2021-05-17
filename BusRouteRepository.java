package com.airbus.repos;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airbus.pojos.BusRoute;


@Repository
public interface BusRouteRepository {
	
	void addBusRoute(BusRoute bRou);
	BusRoute findBusRoute(Integer rno);
	Set<BusRoute> findBusRoutes();
	void modifyBusRoute(BusRoute bRou);
	void removeBusRoute(Integer rno);
}
