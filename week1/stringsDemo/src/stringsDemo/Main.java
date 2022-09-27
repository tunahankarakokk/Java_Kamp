package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = " Bugün hava çok güzel. ";//string bir karakter dizisidir.
		//stringdeki elemanların her biri ayrı ayrı mevcuttur
		System.out.println(mesaj);
		
		 
		 
		 
		System.out.println("Eleman Sayısı : " + mesaj.length());//içerisindeki karakter sayısı
		System.out.println("5. Eleman : " + mesaj.charAt(4));
		//mesaj içerisindeki 5.eleman olan n karakteri gösterilir
		System.out.println(mesaj.concat(" Yaşasın!"));
		//mesaj ile parantez içerisindeki değeri birleştirip gösterdi
		//eğer daha sonra kullanmak istersek bir değişkene atmak gerekir
		System.out.println(mesaj.startsWith("B"));
		//B harfiyle başlıyorsa true başlamıyorsa false değeri
		System.out.println(mesaj.endsWith(":"));
		//: ile bitiyorsa true bitmiyorsa false değer döner ve yazılır
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
//başlangıç noktası,bitiş noktası,aktarılacak yer,aktarılacak yere nereden başlayarak aktar
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
	//parantez içindeki karakterin kaçıncı karakter olduğunu söyler(ilk bulduğu)
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
//sağdan veri içerisinde parantez içindeki değeri arar fakat sol baştan index no verir
	
		System.out.println("---------------------------");
		System.out.println("");
		String yeniMesaj = mesaj.replace(' ','-');//daha sonra kullanmak için
		//ilgili metindeki ilgili değerleri değiştirmek için kullanılır
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//0 ve 1 indexini almadı diğerlerini aldı
		//yoğun olarak kullanılır.görevi bir metin içerisinden parça almak için kullanılır
		System.out.println(mesaj.substring(2, 5));
		//2. indexten 4. indexe kadar alır 5 alınmaz
		for(String kelime : mesaj.split(" ")){
		//verilen karaktere göre karakterleri biribirinden ayırma işlemi yapılır
			System.out.println(kelime);	
		}
		System.out.println(mesaj.toLowerCase());
		//toLowerCase : metin içerisindeki büyük harfleri küçük harflere çevirir
		System.out.println(mesaj.toUpperCase());
		//toUpperCase : metin içerisindeki küçük harfleri büyük harflere çevirir
		System.out.println(mesaj.trim());
		//trim : metin içerisindeki başında ve sonunda olan boşlukları siler
		
		
		
	}

}
