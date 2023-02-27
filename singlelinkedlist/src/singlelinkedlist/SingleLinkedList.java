package singlelinkedlist;
     
    public class SingleLinkedList{
 
            public static void main(String[] args) {
	           LinkedList<Employee> linkedList = new LinkedList<Employee>(); // creation of Linked List
	           
	           linkedList.insertFirst(new Employee("11", "sam"));
	           linkedList.insertFirst(new Employee("21", "amy"));
	           linkedList.insertFirst(new Employee("59", "katy"));
	           linkedList.insertFirst(new Employee("14", "sai"));
	           linkedList.insertFirst(new Employee("39", "pat"));
	 
	           linkedList.displayLinkedList(); // display LinkedList
	                        
	           System.out.print("Deleted Nodes: ");
	           Node<Employee> deletedNode = linkedList.deleteFirst(); //delete Node
	           deletedNode.displayNode();                                 //display deleted Node.
	           deletedNode = linkedList.deleteFirst();      //delete Node.
	           deletedNode.displayNode();                                 //display deleted Node.
	           
	           System.out.println();// sysout used to format output
	           linkedList.displayLinkedList(); //Again display LinkedList
	           
	           
	           
	 
	    }
	}      
 
    