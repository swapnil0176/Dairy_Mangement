package com.dms.model;

import java.util.List;

import com.dms.entities.Bill;
import com.dms.entities.Customer;
import com.dms.entities.Farmer;
import com.dms.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class DairyOwnerDTO {

	@NotBlank
	@Size(min = 10, max = 10, message = "Phone no must be 10 digits")
	private String contactInfo;

	@NotBlank
	@Size(min = 3, max = 20, message = "Name should not less than 3 charactor nor greater than 20 charactor")
	private String name;
	
	@NotBlank
	@Size(min = 4, max = 20, message = "Address should not less than 4 charactor nor greater than 30 charactor")
	private String address;

	private List<Customer> customers;
	
	private List<Farmer> farmers;

	private List<Bill> bills;
	
	private List<Product> products;
}
