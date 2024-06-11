package com.dms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.entities.Customer;
import com.dms.model.CustomerDTO;
import com.dms.repository.CustomerRepository;
import com.dms.service.CustomerService;
import com.dms.utilities.CustomerConverter;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerConverter customerConverter;

	@Override
	public CustomerDTO addCustomer(CustomerDTO customerDTO) {
		
		//Convert to Customer Entity
		final Customer customer=customerConverter.convertToCustomer(customerDTO);
		
		//Save Data in database
		Customer saveInfo = customerRepository.save(customer);
		
		//Convert the customer entity into customer DTO and return the values
		return customerConverter.convertToCustomerDTO(saveInfo);
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		//Fetch all data from database and store in list of customer
		List<Customer> allcustomer=customerRepository.findAll();
		
		//Create Array list of CustomerDTO class
		List<CustomerDTO> list=new ArrayList<>();
		
		//Convert and add all customer into customer dto
		allcustomer.forEach(temp->list.add(customerConverter.convertToCustomerDTO(temp)));
		return list;
	}

	@Override
	public CustomerDTO getCustomerById(int id) {

		//Find and store the customer value
		Customer customer = customerRepository.findById(id).get();
		
		//Convert the customer into dto
		return customerConverter.convertToCustomerDTO(customer);
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDTO, int id) {
		
		//Find the customer id and store info
		Customer customer1 = customerRepository.findById(id).get();
		
		//Convert Customer DTO to Customer Entity
		Customer updatedCustomer=customerConverter.convertToCustomer(customerDTO);
		customer1.setCname(updatedCustomer.getCname());
		customer1.setCemail(updatedCustomer.getCemail());
		customer1.setCaddress(updatedCustomer.getCaddress());
		
		//Save the updated information
		Customer saveInfo = customerRepository.save(customer1);
		
		//Again Convert Customer Entity to Customer DTO and return the data
		return customerConverter.convertToCustomerDTO(saveInfo);
	}

	@Override
	public String deleteCustomerById(int id) {
		customerRepository.deleteById(id);
		return "Customer Information is deleted";
	}

}
