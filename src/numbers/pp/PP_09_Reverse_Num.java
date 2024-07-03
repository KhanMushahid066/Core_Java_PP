package numbers.pp;

import java.util.Scanner;

public class PP_09_Reverse_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter A Number..");
			int n = sc.nextInt();
			int cp=n;//543
			int  r=0;
			while(n>0) {
				int rem = n%10;
				r=(r*10)+rem;
				n = n/10;
				
			}
			
			System.out.println("Reverse Number "+cp+" is "+r);
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();
	}

}
