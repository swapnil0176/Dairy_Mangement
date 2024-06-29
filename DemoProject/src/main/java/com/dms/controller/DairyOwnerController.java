package com.dms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.DairyOwnerDTO;
import com.dms.service.DairyOwnerService;

@RestController
public class DairyOwnerController {

	@Autowired
	DairyOwnerService dairyOwnerService;
	
	@PostMapping("/api/addNewFarmer/{phoneNo}/{id}")
	String addFarmerInDairy(@PathVariable("phoneNo") String phoneNo,@PathVariable("id") String id) {
		
		return dairyOwnerService.addFarmerInDairy(phoneNo, id);
	}
}
