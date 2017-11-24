import java.util.Scanner;

public class bucle {

	public static void main(String[] args) {
		// bucle 
		// holi
		int i = 0;
		int num = 2; 
		int tope;
		Scanner sc=new Scanner(System.in);
		System.out.print("introduce el numero tope");
		tope=sc.nextInt();
		if (tope>=0)
		{		
		while (i<=tope)
		{
		System.out.println(num);
		num=num+2;
		i++;
		
		}
		
	}
		
	}
	
}