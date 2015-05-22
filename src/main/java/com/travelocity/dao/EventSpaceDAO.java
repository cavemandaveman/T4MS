package com.travelocity.dao;

import java.util.List;

import com.travelocity.model.EventSpace;

public interface EventSpaceDAO {
	
	public EventSpace getEventSpace(String name);
	
	public EventSpace getEventSpaceById(int id);
	
	public List<EventSpace> getEventSpaceByPrice(int range);
	
	public List<EventSpace> getEventSpaceByLocation(String location);
	
	public List<EventSpace> getEventSpaceByPriceAndLocation(int range, String location);
	
	public List<EventSpace> getEventSpaces();

}
