package com.billing.service;

import java.util.Set;

import com.billing.model.Bill;
import com.billing.model.Good;

public interface BillingService {

	public Bill calculateTotalBill(Set<Good> set);
	
}
