package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";//ilk index sıfırdan başlar
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		//ogrenciler[4]="Ali";//array index out of bounds hatası sınırlar dışında tanımlama
		System.out.println("--------------------------------");
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);//öğrenciler içindeki 0,1,2 nolu array listelendi
		}
		System.out.println("-------------------------");
		
		for(String ogrencioku:ogrenciler) {//c#da foreach e benzeyen yapı
			System.out.println(ogrencioku);
		}
	}

}
