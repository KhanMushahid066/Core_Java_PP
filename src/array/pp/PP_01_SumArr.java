package array.pp;

public class PP_01_SumArr {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 1, 6, 8 };
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of Arr: "+sum );
		

	}

}
