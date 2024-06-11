package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.Supplier;
import com.dms.model.SupplierDTO;

@Component
public class SupplierConverter {
	
	public SupplierDTO convertToSupplierDTO(Supplier supplier) {
		SupplierDTO sdto=null;
		if(supplier!=null) {
			sdto=new SupplierDTO();
			BeanUtils.copyProperties(supplier, sdto);
		}
		return sdto;
	}
	
	public Supplier convertToSupplier(SupplierDTO supplierDTO) {
		Supplier supplier=null;
		if(supplierDTO!=null) {
			supplier=new Supplier();
			BeanUtils.copyProperties(supplierDTO, supplier);
		}
		return supplier;
	}
}
