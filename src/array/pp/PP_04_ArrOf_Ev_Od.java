package array.pp;

public class PP_04_ArrOf_Ev_Od {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 9, 11, 13, 15, 8, 12, 14 };
		int evlenth=0;
		int oddlength=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				evlenth++;
			}
			else {
				oddlength++;
			}
		}
		int evarr[]=new int[evlenth];
		int oddar[]= new int[oddlength];
		int evarrindex=0;
		int oddarrindex=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				evarr[evarrindex]=a[i];
				evarrindex++;
			}
			else {
				oddar[oddarrindex]=a[i];
				oddarrindex++;
			}
		}
		System.out.print("Odd Arr:   ");
		for (int i = 0; i < oddar.length; i++) {
			System.out.print(oddar[i]+"  ");
		}
		System.out.println();
		System.out.print("Even Arr:   ");
		for (int i = 0; i < evarr.length; i++) {
			System.out.print(evarr[i]+"  ");
		}
	}

}
