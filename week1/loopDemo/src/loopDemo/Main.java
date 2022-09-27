package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=1;i<10;i++) {//1 den 9 a kadar döner
		System.out.println(i);//1 den 9 a kadar değerleri yazar
		}
		System.out.println("Döngü bitti!");
		for(int i=2;i<10;i+=2) {//2 den 9 a kadar çift sayılar döner
			System.out.println(i);//2 den 9 a kadar çift değerleri yazar
			}
		System.out.println("For Döngüleri bitti!");
		
		
		
		//------------While----------------
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		//infinite loop - sonsuz döngü
		System.out.println("While Döngüsü bitti!");
		
		int j = 1;
		//------------Do-While-------------//şart uymasa bile blok en az 1 kere çalışır
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do - While Döngüsü bitti!");

		
	}

}
