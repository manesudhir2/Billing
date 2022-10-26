package com.billing.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.billing.model.Bill;
import com.billing.model.Good;


@Service
public class SampleService implements BillingService{

	@Override
	public Bill calculateTotalBill(Set<Good> set) {
		
		Bill temp = new Bill();
		Set<Good> temp1 = new HashSet<Good>();
		double salesTax = 0;
		double totalBill = 0;
		for(Good i: set) {
			double d = 0.0;
			double tempSalesTax = 0;
			String category = i.getCategory();
			if(!category.equals("Food")) {
				if(!category.equals("Medical")) {
					if(!category.equals("Books")) {
						System.out.println("Category "+category);
						d = i.getPrice();
						d = d * 0.10;
						tempSalesTax += d;
					}
				}
			}
			
			
			if(i.getType().equals("Imported")) {
				d = i.getPrice();
				d = d * 0.05;
				tempSalesTax += d;
			}
			
			i.setPrice(i.getPrice() + tempSalesTax);
			temp1.add(i);
			salesTax += tempSalesTax;
			totalBill += i.getPrice(); 
		}
		
		temp.setSet(temp1);
		temp.setSalesTax(salesTax);
		temp.setTotalBill(totalBill);
		
		return temp;
	}

}
