package cienPrimos;

public class CienPrimos 
{
	
	public static void main(String[] args)
	{
		int div;
		boolean tieneDivisor = false;
		for(int num = 1 ; num <= 100 ; num += 2)
		{
			tieneDivisor = false;
			div = 2;
			while(div <= num / 2 && !tieneDivisor)
			{
				if(num % div == 0)
				{
					tieneDivisor = true;
				}
				div++;
			}
			if(!tieneDivisor)
			{
				System.out.println(num);
			}
		}
	}
}

