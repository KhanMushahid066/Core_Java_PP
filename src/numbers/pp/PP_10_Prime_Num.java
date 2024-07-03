package numbers.pp;

import java.util.Scanner;

public class PP_10_Prime_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter A Number To Check Whether Its Prime Number Or Not.");
			int n=sc.nextInt();
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					count++;
			}
			System.out.println(count);
			if(count==2) {
				System.out.println(n+" Is  Prime Number");
			}
			else {
				System.out.println(n+" Is Not Prime Number");
			}
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
