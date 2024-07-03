package numbers.pp;

import java.util.Scanner;

public class PP_12_Fabonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter a number..");
			int n= sc.nextInt();
			int a=0;
			int b=1;
			System.out.print("Fabpnacci Series: 	");
			System.out.print(a+" "+b);
			for(int i=1;i<=n;i++) {
				int s = a+b;
				System.out.print(" "+s);
				a=b;
				b=s;
				
			}
			System.out.println();
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();
	}
}
