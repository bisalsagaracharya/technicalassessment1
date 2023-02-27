package bubblesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		
		Product pro1=new Product("mobile","1000");
		Product pro2=new Product("laptop","2000");
		Product pro3=new Product("book","3000");
		
		List<Product> l=new ArrayList<Product>();
		l.add(pro1);
		l.add(pro2);
		l.add(pro3);
	
		
		Collections.sort(l);
		System.out.println(l);
		
		 
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
//		
//		 int[]a= {6,36,19,29,12,5};
//		 int temp;
//		 for(int i=0;i<a.length;i++) {
//			 for(int j=0;j<a.length-1;j++) {
//				 
			 
//			 if(a[j]>a[j+1]) {
//				 
//				 temp=a[j];
//				 a[j]=a[j+1];
//			     a[j+1]=temp;
//			   
//			    }
//			 }
//		 }
//		 
//		 for(int i=0;i<a.length;i++) {
//			 System.out.println(a[i]+" ");
//		 }
//
//	}
	
}


























