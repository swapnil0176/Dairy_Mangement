package com.dms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.entities.DairyOwner;
import com.dms.model.DairyOwnerDTO;
import com.dms.repository.DairyOwnerRepository;
import com.dms.service.DairyOwnerService;
import com.dms.utilities.DairyOwnerConverter;

@Service
public class DairyOwnerImpl implements DairyOwnerService {

	@Autowired
	DairyOwnerRepository dairyRepository;

	@Autowired
	DairyOwnerConverter dairyOwnerConverter;

	@Override
	public DairyOwnerDTO loginIntoSystem(DairyOwnerDTO dairyOwnerDTO) {

		// Convert DTO to DairyOwner
		DairyOwner owner = dairyOwnerConverter.convertToDairyOwner(dairyOwnerDTO);
		
		DairyOwner dairyOwner = dairyRepository.findById(owner.getEmail()).get();
		if (owner.getPassword().equals(dairyOwner.getPassword())) {
			System.out.println("Login Success");
		}
		// Convert DairyOwner to DTO
		return dairyOwnerConverter.convertToDairyOwnerDTO(dairyOwner);
	}

}
