package numbers.pp;

import java.util.Scanner;

public class PP_04_Cal_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter Two Numbers..");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("Select Symbol (+, -, *, /)");
			sc.nextLine();
			String s = sc.nextLine();
			switch (s) {
			case "+": {
				System.out.println("Addition of "+n1+" + "+n2+" is= "+(n1+n2));
				break;
			}	
			case "-": {
				System.out.println("Subtraction of "+n1+" + "+n2+" is= "+(n1-n2));
				break;
			}	
			case "*": {
				System.out.println("Multiplication of "+n1+" + "+n2+" is= "+(n1*n2));
				break;
			}	
			case "/": {
				System.out.println("Division of "+n1+" + "+n2+" is= "+(n1/n2));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + s);
			}
			System.out.println("Press Y if want to continue..");
			//sc.nextLine();
			c=sc.nextLine();
			} while (c.equalsIgnoreCase("y"));
		sc.close();

	}

}
