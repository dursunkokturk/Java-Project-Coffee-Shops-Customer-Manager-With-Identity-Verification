package Concretes;

import Entities.Customer;

//CustomerCheckService Interface i Ile 
//Musteri Bilgilerini Dogrulama Isleminin Yapilacagi Class ta Islemi Tanimliyoruz
public class CustomerCheckManager {
	
	// Customer Class inda Yer Alan Ozelliklerden Gelen Data Ile
	// checkIfRealPerson Fonksiyonu Icinde Dogrulama Islemi Yapiyoruz
	public boolean checkIfRealPerson(Customer customer) {
	
		// Dogrulama Islem Sonucunu Dogrulanmis Olarak Kabul Ediyoruz
		return true;
	}
}