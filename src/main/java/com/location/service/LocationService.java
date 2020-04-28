package com.location.service;

import java.util.List;

import com.location.entities.Location;

public interface LocationService {
	//1.method(save location)
  Location saveLocation(Location location);
  
//2.method(update location)
  Location updateLocation(Location location);
  
//3.method(delete location) we use void
  void deleteLocation(Location location);
  
//4.method(get locationById) 
  Location getLocationById(int id);
  
//5.method(return list of location) 
 // import java.util.List;
 List<Location>getAllLocations();
}
