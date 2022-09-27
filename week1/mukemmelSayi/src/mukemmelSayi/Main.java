package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6-->1,2,3 1+2+3=6 o yüzden mükemmel sayı
		//28-->1,2,4,7,14 1+2+4+7+14 mükemmel sayıdır
		int number = 5;
		int total =0;
		for(int i = 1;i<number;i++)
		{
			if (number % i == 0)
			{
				total =total + i;
			}
		}
		if (number == total)
		{
		System.out.println(number + "mükemmel sayıdır");	
		}
		else
		{
			System.out.println("Mükemmel sayı değildir");
		}

	}

}
