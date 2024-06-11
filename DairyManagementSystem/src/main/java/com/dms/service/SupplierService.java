package com.dms.service;

import java.util.List;

import com.dms.model.SupplierDTO;

public interface SupplierService {
	
	SupplierDTO addSupplier(SupplierDTO supplierDTO);
	List<SupplierDTO> getAllSupplier();
	SupplierDTO getSupplierById(int id);
	String deleteSupplierById(int id);
	SupplierDTO updateSupplier(SupplierDTO supllierDTO,int id);
}
