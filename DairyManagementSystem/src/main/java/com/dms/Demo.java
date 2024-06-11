package com.dms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat f;
		f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println("Current date and Time is : " + f.format(d));
	}

}
