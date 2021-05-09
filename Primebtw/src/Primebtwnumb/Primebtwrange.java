package Primebtwnumb;
import java.util.Scanner;
public class Primebtwrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        for(int i=10;i<=99;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.print(i+" ");
            }
        }

	}

}
