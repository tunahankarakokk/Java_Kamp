package datatypes;

public class Main {

	public static void main(String[] args) {
		int sayi=12;
	//sayi = 13111111111; sayının tutabileceği sayı sınırlarını geçtiği için-hata
		byte sayi2=12;	//sayi2=128; sayının tutabileceği sınırlar dışında-hata
		
	//int sayi=12.5; sayı tam sayıları tutabilir ondalık sayıları tutamaz-hata
	//double tanımlayarak bu sayıyı tutabiliriz
		double sayi3 = 12.5;
		sayi3 = -129;
	//char tek karakter tutan 2 baytlık veri tipi ve tek tırnak içinde tanımlanır
		char karakter = 'A';
	//boolean 1 baytlık veri tutar. doğru yanlış(true false tutar) 0 veya 1 dir.
		boolean dogruMu = false;
	}
}
