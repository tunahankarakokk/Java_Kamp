package odev1;

public class CustomerManager {
	private Customer customer;
	ICreditManager creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager)
	{
		this.customer = customer;
		this.creditManager = creditManager;
	}
	public void Add() {
		System.out.println("Müşteri Eklendi" );//customer.FirstName

	}
	public void Save()
	{
		System.out.println("Müşteri Kaydedildi" );//customer.FirstName
	}
	
	public void Delete()
	{
		System.out.println("Müşteri Silindi" );//customer.FirstName
	}
	public void Update() {
		System.out.println("Müşteri Güncellendi" );//customer.FirstName

	}
	public void GiveCredit()
	{
		creditManager.Calculate();
		System.out.println("Kredi verildi");
		creditManager.Save();
	}
}
