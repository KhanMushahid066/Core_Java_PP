package numbers.pp;

import java.util.Scanner;

public class PP_02_FindGreatest_3Number {

	public static void main(String[] args) {
		String c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Two Numbers.");
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			if(n1>n2 && n1>n3) {
				System.out.println(n1+" Is Greater Number.");
			}
			else if(n2>n1 && n2>n3) {
				System.out.println(n2+" Is Greater Number.");
			}
			else {
				System.out.println(n3+" Is Greater Number.");
			}
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c = sc.nextLine();
			
		
		} while (c.equals("y"));
		sc.close();


	}

}
