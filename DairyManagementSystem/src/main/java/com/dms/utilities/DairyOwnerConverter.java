package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.DairyOwner;
import com.dms.model.DairyOwnerDTO;

@Component
public class DairyOwnerConverter {

	// Convert DTO to Entity
	public DairyOwner convertToDairyOwner(DairyOwnerDTO dairyOwnerDTO) {
		DairyOwner dairyOwner = null;
		if (dairyOwnerDTO != null) {
			dairyOwner = new DairyOwner();
			BeanUtils.copyProperties(dairyOwnerDTO, dairyOwner);
		}
		return dairyOwner;
	}

	// Convert Entity to DTO
	public DairyOwnerDTO convertToDairyOwnerDTO(DairyOwner dairyOwner) {
		DairyOwnerDTO dairyOwnerDTO = null;
		if (dairyOwner != null) {
			dairyOwnerDTO = new DairyOwnerDTO();
			BeanUtils.copyProperties(dairyOwner, dairyOwnerDTO);
		}
		return dairyOwnerDTO;
	}
}
