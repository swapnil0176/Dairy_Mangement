package com.dms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.entities.Supplier;
import com.dms.model.SupplierDTO;
import com.dms.repository.SupplierRepository;
import com.dms.service.SupplierService;
import com.dms.utilities.SupplierConverter;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	
	@Autowired
	SupplierConverter supplierConverter;

	@Override
	public SupplierDTO addSupplier(SupplierDTO supplierDTO) {
		
		Supplier supplier=supplierConverter.convertToSupplier(supplierDTO);
		
		//Save data in data base and return the value inform of Supplier
		Supplier saveInfo = supplierRepository.save(supplier);
		
		//Convert the info into Supplier object to SupplierDTO Object
		return supplierConverter.convertToSupplierDTO(saveInfo);
	}

	@Override
	public List<SupplierDTO> getAllSupplier() {

		//Get all info into Supplier Entity
		List<Supplier> allSupplier = supplierRepository.findAll();
		
		//Create SupplierDTO list to store info
		List<SupplierDTO> list= new ArrayList<>();
		for (Supplier supplier : allSupplier) {
			list.add(supplierConverter.convertToSupplierDTO(supplier));
		}
		return list;
	}

	@Override
	public SupplierDTO getSupplierById(int id) {

		Supplier supplier = supplierRepository.findById(id).get();
		return supplierConverter.convertToSupplierDTO(supplier);
	}

	@Override
	public String deleteSupplierById(int id) {
		supplierRepository.deleteById(id);
		return "Supplier information deleted";
	}

	@Override
	public SupplierDTO updateSupplier(SupplierDTO supplierDTO, int id) {

		// Find supplier info
		Supplier s1 = supplierRepository.findById(id).get();
		
		Supplier supplier=supplierConverter.convertToSupplier(supplierDTO);
		//Setting new values or update the information
		s1.setSaddress(supplier.getSaddress());
		s1.setSemail(supplier.getSemail());
		s1.setSname(supplier.getSname());
		
		//Save data in database
		Supplier saveInfo = supplierRepository.save(s1);
		return supplierConverter.convertToSupplierDTO(saveInfo);
		
	}

}
