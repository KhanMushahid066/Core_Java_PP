package numbers.pp;

import java.util.Scanner;

public class PP_11_Prime_Num_1_100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			int i,j;
			for(i=1;i<=100;i++) {
				for(j=2;j<=i;j++) {
					if(i%j==0)
						break;
				}
				if(i==j) {
					System.out.print(" "+j);
				}
			}
			System.out.println();
			System.out.println("Press Y if want to continue..");
			sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
