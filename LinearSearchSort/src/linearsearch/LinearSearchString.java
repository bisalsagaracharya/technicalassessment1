package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchString {

	public static void main(String[] args) {
		
		
		Employe arr[]=new Employe[7];
		
	    arr[0]=new Employe("bisal","123456",10);
	    arr[1]=new Employe("bisal1","123456",11);
	    arr[2]=new Employe("bisal2","123456",12);
	    
	    
		
	 
		//String [] arr= {"bisal","rohit","rahul","bipul"};
		String item="bisal";
		int temp=0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i].equals(item)) { // i used equal method to compare 2 string value. string class method 
				System.out.println("item present in "+i+" index position");
				 temp=temp+1;
			}
			
//	 
//		if(temp==0) {
//			 System.out.println("item is not present");
////		}
//	}
		
		
		
		
		

}
}
}
