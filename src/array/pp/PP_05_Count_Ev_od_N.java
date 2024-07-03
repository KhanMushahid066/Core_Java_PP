package array.pp;

public class PP_05_Count_Ev_od_N {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 9, 11, 13, 15, 8, 12, 14 };
		int countodd=0;
		int countev=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				countev++;
			}else {
				countodd++;
			}
		}
		System.out.println("even Number occrs:   "+countev);
		System.out.println("odd  Number occrs:   "+countodd);
	}

}
