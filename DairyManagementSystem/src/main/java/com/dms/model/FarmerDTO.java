package com.dms.model;

import com.dms.entities.DairyOwner;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FarmerDTO {
	
	@NotBlank
	@Size(min = 3,max=20,message="Name should not less than 3 charachter and not more than 20 charactor")
	private String name;
	
	@NotBlank
	@Size(min = 3,max=20,message="Address should not less than 3 charachter and not more than 20 charactor")
	private String address;
	
	@NotBlank
	@Size(min = 10,max=10,message="Phone no must be a 10 digits")
	private String phoneNo;
	
	private DairyOwner dairyOwner;
}
