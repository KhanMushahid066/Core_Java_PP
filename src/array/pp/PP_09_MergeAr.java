package array.pp;

public class PP_09_MergeAr {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(c[i]);
//		}
		System.out.println(a.length);
		System.out.println(c[a.length]);//c[3]==0; bcz c[]={10,20,30,0,0,0}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

		
	}

}
