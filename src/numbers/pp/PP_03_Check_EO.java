package numbers.pp;

import java.util.Scanner;

public class PP_03_Check_EO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter  A Number..");
			int n1 = sc.nextInt();
			if(n1%2==0) {
				System.out.println(n1+" Is Even Number..");
			}else {
				System.out.println(n1+" Is odd Number..");
			}
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();
	}

}
