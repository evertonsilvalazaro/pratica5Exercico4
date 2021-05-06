import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double fatorial =1;
		
		do {
			System.out.println("informe um numero ");
			n=sc.nextInt();
			
			if(n<0)
				System.out.println("numero invalido ");
			
			
		}while (n<0);
		
		for(i=n;i>0;i--) {
			fatorial*=i;
		System.out.println(fatorial);
    
		sc.close();
		}
	}

}
