
public class Main {

	public static void main(String[] args) {
	Customer customer = new Customer();
	Employee employee = new Employee();
	customer.id = 1;
	customer.firstName = "Tunahan";
	customer.lastName = "Karakök";
	customer.age = 24;
	customer.email ="abc@gmail.com";
	//id,firstName,lastName,age kendi tanımlanan classında olmamasına rağmen bu nesnelere sahip olması inheritance dan dolayı 
	//inherite edilen classın nesneleri diğer class içinde kullanılabilir oluyor
	employee.id = 2;
	employee.firstName = "Steve";
	employee.lastName = "Harder";
	employee.age = 21;
	employee.salary =8000;
	
	
	EmployeeManager employeeManager = new EmployeeManager();
	employeeManager.BestEmployee();
	employeeManager.Add();
	employeeManager.List();
	CustomerManager customerManager = new CustomerManager();
	customerManager.Add();
	customerManager.List();
	//buradada her ikisinin inherite edildiği class içerisinde 
	//Add ve List operasyonları olduğu için bu classlarda o operasyonları oluşturabiliyor
	}

}
