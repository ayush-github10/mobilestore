package com.sopra.microservices;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class MicroservicesmobilestoreApplicationTests {
	@Autowired
	private MockMvc obj;
	@Autowired
	private MobileStoreRepo repo;
	
	@Test
	@Disabled
	public void testFun() throws Exception
	{
		List<MobileStore> lst=new ArrayList<MobileStore>();
		MobileStore m1= new MobileStore("Apple", "Iphone", "SFSFS767865", 499999,"3GB","128GB", null);
		MobileStore m2= new MobileStore("SAmsung", "S24", "SFSDS734235", 99999,"8GB","256GB", null);
		repo.save(m1);
		repo.save(m2);
		
		ResultActions res = obj.perform(MockMvcRequestBuilders.get("/mobilestore/getAll"));
		res.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testpost() throws Exception {
		
		MobileStore m3= new MobileStore("Realme", "5pro", "SMCVCVS7646565", 19999,"6GB","128GB", null);
	    repo.save(m3);
		obj.perform(post("/mobilestore/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(m3)))
		        .andExpect(status().isCreated());

		
	}

	
}
