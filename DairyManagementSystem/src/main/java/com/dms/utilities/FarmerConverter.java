package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.Farmer;
import com.dms.model.FarmerDTO;

@Component
public class FarmerConverter {
	
	public FarmerDTO convertToFarmerDTO(Farmer farmer) {
		FarmerDTO fdto=null;
		if(farmer!=null) {
			fdto=new FarmerDTO();
			BeanUtils.copyProperties(farmer, fdto);
		}
		return fdto;
	}
	
	public Farmer convertToFarmer(FarmerDTO farmerDTO) {
		Farmer farmer=null;
		if(farmerDTO!=null) {
			farmer=new Farmer();
			BeanUtils.copyProperties(farmerDTO, farmer);
		}
		return farmer;
	}
}
