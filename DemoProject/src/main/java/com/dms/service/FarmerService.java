package com.dms.service;

import java.util.List;

import com.dms.model.FarmerDTO;

public interface FarmerService {
	
	FarmerDTO addFarmer(FarmerDTO farmerDTO);
	List<FarmerDTO> getAllFarmer();
	FarmerDTO getFarmer(String phoneNo);
	String deleteFarmer(String phoneNo);
	FarmerDTO updateFarmer(FarmerDTO farmerDTO,String phoneNo);
}
