package recapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc;
		sonuc = dortIslem.Topla(3,4);
		System.out.println("Toplama işleminin sonucu : " + sonuc);
		sonuc = dortIslem.Cikar(8,3);
		System.out.println("Çıkarma işleminin sonucu : " + sonuc);
		sonuc =dortIslem.Carp(5,6);
		System.out.println("Çarpma işleminin sonucu  : " + sonuc);
		sonuc =dortIslem.Bol(24,4);
		System.out.println("Bölme işleminin sonucu : " + sonuc);
	}

}
