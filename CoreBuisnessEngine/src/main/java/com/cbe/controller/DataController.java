package com.cbe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbe.bean.Avengers;
import com.cbe.repository.UserRepository;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/api")
@Component
//@EnableAutoConfiguration
public class DataController {
	
	 @Autowired
	    UserRepository repository;
	
	@RequestMapping(value="/getalldata" , method = RequestMethod.POST , headers = {
    "content-type=application/json" })
	@ResponseBody
	public Avengers getListOfData(@RequestBody Avengers avengers) {
		
		/*Collection<String> readValues = new ObjectMapper().
				readValues(divisions, new TypeReference<Collection<String>>() { });*/
		System.out.println("the data is "+avengers.getAvengerId() );
		//List<String> divStore = new ArrayList<>();
		
		/*if(!StringUtils.isEmpty(divisions)){
			for(String d :divisions ){
				for(String s:stores){
					divStore.add(d);
					divStore.add(s);
				}
			}
		}*/
		
 
		return avengers; 
	}
	
	@RequestMapping("/welcomeToWorld")
	public String demoForData(){
		System.out.println("Student id 10001 " + repository.findAll());
		return"Welocome On Board";
	} 
	
	
}
