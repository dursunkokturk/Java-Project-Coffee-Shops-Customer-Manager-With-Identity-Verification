package Abstracts;

import Entities.Customer;

//Starbucks Icin Musteri Dogrulamasi Yapiyoruz
public interface ICustomerCheckService {
	
	// Customer Class i Icindeki Data Ozelliklerini Kullanarak
	// Dogrulama Islemini Yapiyoruz
	public static boolean checkIfRealPerson(Customer customer) {
	
		// Dogrulama Isleminin Gecerli Oldugunu Belirtiyoruz
		return true;
	}
}