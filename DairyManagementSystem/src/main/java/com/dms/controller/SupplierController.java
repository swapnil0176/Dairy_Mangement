package com.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.SupplierDTO;
import com.dms.service.SupplierService;
import com.dms.utilities.SupplierConverter;

@RestController
public class SupplierController {

	@Autowired
	SupplierService supplierService;

	@Autowired
	SupplierConverter supplierConverter;

	// It is use to send data to server or save data in database
	@PostMapping("/api/addSupplier")
	SupplierDTO addSupplier(@RequestBody SupplierDTO supplierDTO) {
		return supplierService.addSupplier(supplierDTO);
	}

	// It is use to view data from server or database
	@GetMapping("api/getAllSupplier")
	List<SupplierDTO> getAllSupplier() {
		return supplierService.getAllSupplier();
	}

	// Find supplier by id
	@GetMapping("/api/getSupplierById/{id}")
	SupplierDTO getSupplierById(@PathVariable("id") int id) {
		return supplierService.getSupplierById(id);
	}

	// Update the supplier information
	@PutMapping("api/updateSupplier/{id}")
	SupplierDTO updateSupplier(@RequestBody SupplierDTO supplierDTO, @PathVariable("id") int id) {
		return supplierService.updateSupplier(supplierDTO, id);
	}

	// Delete Supplier by id
	@DeleteMapping("/api/deleteSupplierById/{id}")
	String deleteSupplierById(@PathVariable("id") int id) {
		return supplierService.deleteSupplierById(id);
	}
}
