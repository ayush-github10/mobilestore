package com.sopra.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.microservices.exception.MobileNotFoundException;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/mobilestore")
public class Controlller {
	
	@Autowired
	private Services ser;
	
	@PostMapping("/add")
	public ResponseEntity<Void> add(@RequestBody MobileStore ms){
		ser.add(ms);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<MobileStore>> getAll(){
		List<MobileStore> ls=ser.getAll();
		return new ResponseEntity<>(ls,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{imei}")
	public ResponseEntity<MobileStore> getbyId(@PathVariable("imei") String imei){
		if(ser.getbyId(imei)!=null) {
		MobileStore ms=ser.getbyId(imei);
		return new ResponseEntity<>(ms,HttpStatus.OK);
		}
		else {
			throw new MobileNotFoundException("mobile not found");
		}
		
	}
	@DeleteMapping("delete/{imei}")
	public ResponseEntity<Void> deletebyId(@PathVariable("imei") String imei){
		ser.deletebyId(imei);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
