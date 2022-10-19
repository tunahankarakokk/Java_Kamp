package odev1;

public class Main {

	public static void main(String[] args) {
		/*
		int sayi1 =10;//10
		int sayi2 = 20;//20
		sayi1 = sayi2;//20
		sayi2 = 100;//100
		System.out.println(sayi1);//20
		*/
		/*
		int[] sayilar1 = new int[] {1,2,3};//1,2,3
		int[] sayilar2 = new int[] {10,20,30};//10,20,30
		
		sayilar1 = sayilar2;//sayilar1 dizisinin referansını sayilar2 nin referansı artık
		sayilar2[0] = 1000;//1000
		System.out.println(sayilar1[0]);//1000
		*/
		/*
		CreditManager creditManager = new CreditManager();//örneğini oluşturmak , instance ını oluşturmak, instance creation
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.FirstName = "Engin";
		customer.LastName = "Demiroğ";
		
		customer.City = "Ankara";
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();

		Company company = new Company();
		company.TaxNumber = "100000";
		company.CompanyName = "Arçelik";
		company.Id = 100;
		CustomerManager customerManager2 = new CustomerManager(new Company());//new Person()
		
		Person person = new Person();
		person.NationalIdentity = "";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		*/
		//IOC Container
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());//new MilitaryCreditManager
		customerManager.GiveCredit();
		
		
		
		
		
	}

}
