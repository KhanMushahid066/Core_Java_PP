package numbers.pp;

import java.util.Scanner;

public class PP_05_Swap_2N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter Two Numbers..");
			int n1 = sc.nextInt();//10
			int n2 = sc.nextInt();//20
			System.out.println("====Before Sawping====");
			System.out.println("N1 "+n1);
			System.out.println("N2 "+n2);
			n1=n1+n2;//10+20=30
			n2=n1-n2;//30-20==10
			n1 = n1-n2;//30-10==20
			System.out.println("====After  Sawping====");
			System.out.println("N1 "+n1);
			System.out.println("N2 "+n2);
			
			
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
