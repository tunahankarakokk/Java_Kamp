package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel !";
		String yeniMesaj= sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int result=topla2(2,3,4);
		System.out.println(result);
		
	}
	public static void ekle() {
		
		System.out.println("Eklendi !");
	}
	public static void sil() {
		System.out.println("Silindi !");		
	}
	public static void guncelle() {
		System.out.println("Güncellendi !");
	}
	public static int topla(int sayi1,int sayi2) {//bu fonksiyon integer türünde bir değer döndürür
		
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {//integer array gibi çalışır
		int toplam = 0;//değişken sayıda argüman alması gereken metotların oluşturulmasını basitleştiren bir özelliğe sahiptir.
//Bu özelliğe değişken uzunluklu argümanlar(variable-length arguments)
//anlamındaki varargs denir.
		
		
		for (int sayi : sayilar) {    
			toplam +=sayi;
		}
		return toplam;
	}
	
	
	
	public static String sehirVer() {
		return "Ankara";
	}
}
