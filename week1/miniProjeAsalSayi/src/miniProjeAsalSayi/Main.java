package miniProjeAsalSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2 ; //25 % 2 = kalan değeri
		//System.out.println(remainder);
		boolean asalMi=true;//isprime
		if (number == 1)
		{
		System.out.println("Geçersiz sayı");
		return;
		}
		if (number<2) {
			System.out.println("Sayı asal değildir");
			return;
		}
		else
		{
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				asalMi=false;
			}	
		}
		if (asalMi) {
			System.out.println("Sayı asaldır");
			
		}
		else
		{
			System.out.println("Sayı asal değil");
		}
		

	}
	}
}
