 package array.pp;

public class PP_06_Find_Max_Min_value {

	public static void main(String[] args) {
		int a[] = { 10,2, 5, 3 ,1};
		int max =a[0];
		int min =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}else {
				min=a[i];
			}
		}
		System.out.println("Max value:   "+max);
		System.out.println("Min value:   "+min);


	}

}
