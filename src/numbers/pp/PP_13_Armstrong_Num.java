package numbers.pp;

import java.util.Scanner;

public class PP_13_Armstrong_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter A Number...");
			int n= sc.nextInt();
			int cp=n;
			int  rev=0;
			while(n>0) {
				int rem=n%10;
				rev=(rem*rem*rem)+rev;
				n=n/10;
			}
			if(cp==rev) {
				System.out.println(cp+" Is Armstrong Number");
			}
			else {
				System.out.println(cp+" Is Not Armstrong Number");
			}
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
