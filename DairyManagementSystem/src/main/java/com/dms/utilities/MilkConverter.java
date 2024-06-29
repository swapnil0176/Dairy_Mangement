package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.Milk;
import com.dms.model.MilkDTO;

@Component
public class MilkConverter {

	// Convert Milk Entity into Milk DTO
	public MilkDTO convertToMilkDTO(Milk milk) {
		MilkDTO milkDTO = null;
		if (milk != null) {
			milkDTO = new MilkDTO();
			BeanUtils.copyProperties(milk, milkDTO);
		}
		return milkDTO;
	}

	// Convert Milk Entity into Milk DTO
	public Milk convertToMilk(MilkDTO milkDTO) {
		Milk milk = null;
		if (milkDTO != null) {
			milk = new Milk();
			BeanUtils.copyProperties(milkDTO, milk);
		}
		return milk;
	}

}
