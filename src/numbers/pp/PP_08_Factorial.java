package numbers.pp;

import java.util.Scanner;

public class PP_08_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			
			System.out.println("Enter A Number..");
			int n = sc.nextInt();
			int f=1;
			for(int i=1;i<=n;i++) {
				f=f*i;
			}
			System.out.println("Factorial of "+n+" " + f);
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
