package EveorOd;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		value=s.nextInt();
		s.close();
		
		if(value%2==0)
			System.out.printf("%d is Even",value);
		else
			System.out.printf("%d is Odd",value);
	
		

	}

}
