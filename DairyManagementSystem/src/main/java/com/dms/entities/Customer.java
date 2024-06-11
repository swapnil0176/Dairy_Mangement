package com.dms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//In this annotation Getter setter and toString method is present
@Data

// In this annotation no argument constructor is present
@NoArgsConstructor

//In this annotation All argument constructor is present
@AllArgsConstructor

@Entity
@Table(name="customer-info")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid",length=30)
	private int cid;
	
	@Column(name="cname",length=30)
	private String cname;
	
	@Column(name="cemail",length=30)
	private String cemail;
	
	@Column(name="caddress",length=30)
	private String caddress;
}
