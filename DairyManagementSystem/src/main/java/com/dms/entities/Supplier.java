package com.dms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//In this @Data annotation the in build methods that are known as getters and setters and toString method
@Data

//It denotes this class is a table
@Entity
@Table(name="supplier-info")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid",length=30)
	private int sid;
	
	@Column(name = "sname",length=30)
	private String sname;
	
	@Column(name = "saddress",length=30)
	private String saddress;
	
	@Column(name = "semail",length=30)
	private String semail;
	
	

}
