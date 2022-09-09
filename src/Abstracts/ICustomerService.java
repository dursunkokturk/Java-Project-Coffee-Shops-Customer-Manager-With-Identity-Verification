package Abstracts;

import Entities.Customer;

//Save Fonksiyonunun Kullanmasi Gereken Yerlerde 
//Fonksiyonun Icinde Yer Aldigi Interface i 
//Implements Komutu Ile Eklemek Gerekiyor
public interface ICustomerService {
	
	// Save Fonksiyonunu Kullanmasi Gereken Class lar Icin 
	// Ortak Fonksiyon Olusturuyoruz
	public void save(Customer customer);
}