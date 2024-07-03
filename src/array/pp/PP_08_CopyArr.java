package array.pp;

public class PP_08_CopyArr {

	public static void main(String[] args) {
		int a[]= {3,2,5,1,6,10};
		int c[]	= new int[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
