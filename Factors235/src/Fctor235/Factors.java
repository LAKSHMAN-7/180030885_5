package Fctor235;
public class Factors 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<100;i++)
		{
			if((i%2==0) && (i%3==0) && (i%5==0))
			{
				System.out.println(i);
			}
		}
	}
}