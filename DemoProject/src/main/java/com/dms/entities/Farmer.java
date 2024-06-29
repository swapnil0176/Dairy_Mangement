package com.dms.entities;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

//In this @Data annotation the in build methods that are known as getters and setters and toString method
@SuppressWarnings("deprecation")
@Data

@SQLDelete(sql = "update FarmerInformation set status=true where phone_No=?")
@Where(clause = "status=false")
//It denotes this class is a table
@Entity
@Table(name = "FarmerInformation")
public class Farmer {
	@Id
	@Column(length = 10, unique = true)
	private String phoneNo;

	@Column(length = 30)
	private String name;

	private boolean status = Boolean.FALSE;
	
	@Column(length = 30)
	private String address;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="dairyOwnerId")
	@JsonIgnoreProperties("farmers")
	private DairyOwner dairyOwner;
}
