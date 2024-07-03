package numbers.pp;

import java.util.Scanner;

public class PP_07_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter A Number..");
			int n1 = sc.nextInt();
			for(int i =1;i<=10;i++) {
				System.out.println(n1+" x "+i+" = "+(n1*i));
			}
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
