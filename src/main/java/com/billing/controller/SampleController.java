package com.billing.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billing.model.Bill;
import com.billing.model.Good;
import com.billing.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	@PostMapping("/getTotalBill")
	public Bill getTotalBill(@RequestBody Set<Good> set) {
		
		System.out.println("Recieved set"+set);
		
		return sampleService.calculateTotalBill(set);
	}
	
}
