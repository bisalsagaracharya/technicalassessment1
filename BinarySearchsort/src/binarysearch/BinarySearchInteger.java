package binarysearch;

public class BinarySearchInteger {

	public static void main(String[] args) {
		
		int []arr= {2,4,5,6,8,9,23,25,26,28}; //sorted form in binary search
		
		int srch=9;
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(arr[mi]==srch) {
				System.out.println("element is at "+mi+" index positon");
				break;
			}
			else if(arr[mi]<srch) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
			
		}
		if(li>hi) {
			System.out.println("element is not present");
		}
	}

}
