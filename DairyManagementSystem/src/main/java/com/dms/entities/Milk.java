package com.dms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Milk-info")
public class Milk {

	@Id
	@Column(name="price",length=30)
	private int price;
	
	@Column(name="quantity",length=30)
	private int quantity;
	
	@Column(name="fat",length=30)
	private int fat;
}
