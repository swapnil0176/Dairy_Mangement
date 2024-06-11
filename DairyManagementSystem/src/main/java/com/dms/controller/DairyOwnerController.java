package com.dms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.DairyOwnerDTO;
import com.dms.service.DairyOwnerService;

@RestController
public class DairyOwnerController {

	@Autowired
	DairyOwnerService dairyOwnerService;
	
	@PostMapping("/api/login")
	DairyOwnerDTO loginIntoSystem(@RequestBody DairyOwnerDTO dairyOwnerDTO) {
		return dairyOwnerService.loginIntoSystem(dairyOwnerDTO);
	}
}
