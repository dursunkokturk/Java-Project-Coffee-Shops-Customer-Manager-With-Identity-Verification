package day4_homework_07;

import Abstracts.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// new Anhatar Kelimesinin Kullanildigi Kisimda 
		// Hangi Objesi Adi Yazili Ise O Obje Uzerinden 
		// BaseClassManager Class i Icindeki Save Fonksiyonuna 
		// Data Gonderiyoruz
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"98765432123","Dursun","Köktürk",1986));
	}
}