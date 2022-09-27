package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager1 = new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager1 = customerManager2;//customerManager1 in referansı
											//customerManager2nin referansını aldı
		customerManager1.Add();
		customerManager1.Remove();
		customerManager1.Update();
		
		//value types
		int sayi1 = 10;//10
		int sayi2 = 20;//20
		sayi2 = sayi1;//10 - sayi2 nin değeri sayi1 in değeridir
		sayi1=30;//30 sayi1 in değeri 30
		System.out.println(sayi2);//10 sayi2(10) nin değerini ekrana yazdır 
		
		int[] sayilar1=new int[]{1,2,3};//sayılar1 i heap de oluştur 1,2,3 ü yaz
		int[] sayilar2=new int[]{4,5,6};//sayılar2 yi heap de oluştur 4,5,6 yı yaz
		sayilar2=sayilar1;//sayılar2 sayilar1 in referansındaki sayılar {1,2,3} olur
		sayilar1[0]=10;//sayılar1 in referansındaki 0. dizini 10 değeri yap
		System.out.println(sayilar2[0]);//sayılar2 sayılar1 in dizini tutar bu yüzden 
		//ekrana 10 u yaz
		
		
		//---------------DEĞER TİPLER(VALUE TYPES) NASIL ÇALIŞIR---------------
		//HEAP ile alakası yok direk stackde çalışır
		//değişken ve sayı beraber stackde çalışır
		
		//---------------REFERENCE TYPES NASIL ÇALIŞIR-------------------------
		//Değişken STACKde tanımlanıyor
		//Değerler HEAP'e yerleşiyor
		//STACK'de değişken HEAP'de bulunan değerlerin yerini Referans nosunu tutar.
		
		
		
		
	}

	
}
