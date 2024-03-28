package com.sopra.microservices;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface Services {
	
	public MobileStore add(MobileStore ms);
	
	public List<MobileStore> getAll();
	
	public MobileStore getbyId(String imei);
	
	public void deletebyId(String imei);

}
