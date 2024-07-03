package array.pp;

public class PP_07_AnyPotionNumber {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 23, 13, 43, 64, 24, 67 };
 //int a[j] = { 2, 5, 3, 23, 13, 43, 64, 24, 67 };
		int t;
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
			System.out.print("Secound Largest Element "+a[a.length-2]+" ");
		
		

	}

}
