package com.sopra.microservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.microservices.exception.MobileNotFoundException;

@Service
public class ServicesImplementation implements Services{
	
	@Autowired
	private MobileStoreRepo repo;

	@Override
	public MobileStore add(MobileStore ms) {
		return repo.save(ms);
	}

	@Override
	public List<MobileStore> getAll() {
		return repo.findAll();
	}

	@Override
	public MobileStore getbyId(String imei) {
		Optional<MobileStore> mob=repo.findById(imei);
		if(mob.isEmpty()) {
			return null;
		}
		else {
		return mob.get();
		}
	}

	@Override
	public void deletebyId(String imei) {
		repo.deleteById(imei);
	}
	
	 

}	