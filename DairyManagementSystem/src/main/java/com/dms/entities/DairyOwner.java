package com.dms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="dairy-owner-info")
@Data
public class DairyOwner {
	
	@Id
	@Column(name="username",length = 40,nullable = true)
	private String email;
	
	@Column(name="password",length = 40,nullable = true)
	private String password;
	
	
}
