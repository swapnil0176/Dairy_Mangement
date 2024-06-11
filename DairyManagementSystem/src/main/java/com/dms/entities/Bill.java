package com.dms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Bill-info")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bill_id", length = 30)
	private int bill_id;
	
	@Column(name = "bill_date", length = 30)
	private String date;

	@Column(name = "bill_amount", length = 30)
	private int amount;

	
}
