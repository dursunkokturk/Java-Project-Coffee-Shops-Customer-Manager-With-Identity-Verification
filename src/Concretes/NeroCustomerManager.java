package Concretes;

import Abstracts.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	/*
	// Bagimli Olunan Class i Gevsek Bagimliliga Cevirmek Gerekiyor
	CustomerCheckService customerCheckServise;
	
	// CustomerCheckService Class i Uzerinden Girilen Musteri Bilgilerini 
	// this Anahtar Kelimesini Kullanarak Dogrulama Islemi Yapiyoruz
	public NeroCustomerManager(CustomerCheckService customerCheckServise) {
		this.customerCheckServise = customerCheckServise; 
	}
	*/
	@Override
	
	// BaseCustomerManager Class ini Cagiran Class ta 
	// CustomerService Interface i Icinde Yer Alan
	// Save Fonksiyonu da Kullanilir Olacak
	public void save(Customer customer) {
		/*
		if (CustomerCheckService.checkIfRealPerson(customer)) {
			
			// Kayit Isleminin Gerceklestigini Belirten Mesaj Ve 
			// Kaydedilen Data yi Yazdiriyoruz
            System.out.println("Saved in Database : " + customer.firstName);
        }
        else {
            System.out.println("Not A Valid Person");
        }
        */
   }
}