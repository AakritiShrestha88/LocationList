package com.location.service;

import java.lang.module.FindException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Location;
import com.location.repository.LocationRepository;

//step 1
@Service
public class LocationServiceImplementation implements LocationService {
	@Autowired
	// step 2
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);

	}


	@Override
	public Location getLocationById(int id) {
		
		return repository.findById(id).get();
		
	}

	@Override
	public List<Location> getAllLocations() {
		
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
