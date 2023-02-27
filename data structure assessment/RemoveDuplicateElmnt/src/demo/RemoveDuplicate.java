package demo;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 
		int[]arr= {1,2,3,4,5,6,1,2,3,4};
		int temp=0;
		int count;
		int size=arr.length;
		int[] dup=new int[size];
		
		for(int i=0;i<size;i++) {
			count=0;
			for(int j=i+1;j<size;j++) {
				
				if(arr[i]==arr[j]){
					count++;
							
				}
			}
			
			if(count==0) {
				dup[temp]=arr[i];
				temp++;	
			}	
		}
		
		for(int i=0;i<temp;i++) {
			arr[i]=dup[i];
			 
			System.out.println(arr[i]);
		}
		
		
         
	}

}
