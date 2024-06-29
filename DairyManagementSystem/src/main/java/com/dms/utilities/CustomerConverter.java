package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.Customer;
import com.dms.model.CustomerDTO;

@Component
public class CustomerConverter {

	// Convert Customer Entity to Customer DTO
	public CustomerDTO convertToCustomerDTO(Customer customer) {
		CustomerDTO customerDTO = null;

		if (customer != null) {
			customerDTO = new CustomerDTO();
			BeanUtils.copyProperties(customer, customerDTO);
		}

		return customerDTO;
	}

	// Convert Customer DTO to Customer Entity
	public Customer convertToCustomer(CustomerDTO customerDTO) {

		Customer customer = null;
		if (customerDTO != null) {
			customer = new Customer();
			BeanUtils.copyProperties(customerDTO, customer);
		}
		return customer;
	}

}
