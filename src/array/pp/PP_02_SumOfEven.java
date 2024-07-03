package array.pp;

public class PP_02_SumOfEven {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 1, 6, 8 };
		int even=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			even = even+a[i];
		}
		System.out.println("Sum of even number of Arr: "+even );

		

	}

}
