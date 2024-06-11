package com.dms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillDTO {
	private int bill_id;
	private String date;
	private int amount;
}
