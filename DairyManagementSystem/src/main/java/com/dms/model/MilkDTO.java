package com.dms.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class MilkDTO {

	private int price;
	private int quantity;
	private int fat;
}
