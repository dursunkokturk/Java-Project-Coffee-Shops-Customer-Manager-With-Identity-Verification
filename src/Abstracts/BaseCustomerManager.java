package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	
	@Override
	
	// BaseCustomerManager Class ini Cagiran Class ta 
	// CustomerService Interface i Icinde Yer Alan
	// Save Fonksiyonu da Kullanilir Olacak
	public void save(Customer customer) {
		System.out.println("Saved To Database : " + customer.firstName);
	}

}