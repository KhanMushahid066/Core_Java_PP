package array.pp;

public class PP_03_Sumofodd {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 1, 6, 8 };
		int oddsum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0)
			oddsum = oddsum+a[i];
		}
		System.out.println("Sum of oddsum number of Arr: "+oddsum );
	}

}
