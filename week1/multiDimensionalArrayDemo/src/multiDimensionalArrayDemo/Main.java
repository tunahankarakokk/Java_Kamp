package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];//çift boyutlu dizi
		
		sehirler[0][0]="İstanbul";//Marmara
		sehirler[0][1]="Bursa";//Marmara
		sehirler[0][2]="Bilecik";//Marmara
		sehirler[1][0]="Ankara";//İç Anadolu
		sehirler[1][1]="Konya";//İç Anadolu
		sehirler[1][2]="Kayseri";//İç Anadolu
		sehirler[2][0]="Diyarbakır";//Doğu Anadolu
		sehirler[2][1]="Şanlıurfa";//Doğu Anadolu
		sehirler[2][2]="Gaziantep";//Doğu Anadolu
		
		for(int i = 0;i<=2;i++) {//iç içe döngüler
			int bolge=3;
			if(i!=bolge) {
				System.out.println(i+1 + ". Bölge");
				System.out.println("-------------------");
				bolge++;
			}
			
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
				if(j==2) {
					System.out.println("-------------------");
				}
			}
			
			
			
			
		}
	
	
	}
	

}
