package Entities;

import Abstracts.IEntity;

//Ilerleyen Asamalarda Nesneslik Ile Ilgili Sorun Olmamasi Icin
//Entity Interface ini Implement Etmek Gerekiyor
//Ayni Zamanda Database Objesi Oldugunu Gosteriyoruz
public class Customer implements IEntity{
	// Iki Sirketinde Musteri Bilgilerini Kaydetme Istegi Oldugundan
	// Gereken Ozellikleri Belirtmek Gerekiyor
	public int id;
	public String nationalityId;
	public String firstName;
	public String lastName;
	public int birthDay;
	
	public Customer() {
		
	}
	
	public Customer(int id,String nationalityId,String firstName,String lastName,int birthDay) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
}