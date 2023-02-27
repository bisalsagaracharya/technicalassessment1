package inheritance;

import java.util.Scanner;

public class Driver{
		 

		public static void main(String[] args) {
			 Inheritance parent=new Inheritance();	
			 parent.home();
			 
			 InheritanceNew chaild=new InheritanceNew();
			 chaild.home();
			 
			   Scanner scanner =new Scanner(System.in);
				System.out.println("1)parent  2) chaild");
				int choice =scanner.nextInt();
				Inheritance pre;
				if(choice ==1) {
					pre =parent;
				}
				else
				{
					 
					pre = chaild;
				}
				pre.home(); 
			
	}

}
