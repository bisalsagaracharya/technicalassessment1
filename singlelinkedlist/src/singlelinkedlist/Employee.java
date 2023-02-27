package singlelinkedlist;

public class Employee {
	
	  private String id;
	    private String name;
	    
	    /**
	     * Employee constructor
	     */
	    public Employee(String id, String name) { // constructor
	           this.id = id;
	           this.name = name;
	    }
	 
	    @Override
	    public String toString() {
	           return "Employee [id=" + id + ", name=" + name + "]   ";
	    }
	    
	}
	 
	 
	/**
	 *Exception to indicate that LinkedList is empty.
	 */
	class LinkedListEmptyException extends RuntimeException{
	       public LinkedListEmptyException(){
	         super();
	       }
	      
	     public LinkedListEmptyException(String message){
	         super(message);
	       }  
	}
	 
	/**
	 *Node class, which holds data and contains next which points to next Node.
	 */
	class Node<T> {
	    public T data; // data in Node.
	    public Node<T> next; // points to next Node in list.
	 
	    /**
	     * Constructor
	     */
	    public Node(T data){
	           this.data = data;
	    }
	 
	    /**
	     * Display Node's data
	     */
	    public void displayNode() {
	           System.out.print( data + " ");
	    }
	}
	 
	 
	/**
	 * Singly LinkedList class (Generic implementation)
	 */
	class LinkedList<T> {
	    private Node<T> first; // ref to first link on list
	 
	    /**
	     * LinkedList constructor
	     */
	    public LinkedList(){
	           first = null;
	    }
	 
	    /**
	     * Insert New Node at first position
	     */
	    public void insertFirst(T data) {
	           Node<T> newNode = new Node<T>(data);  //Creation of New Node.
	           newNode.next = first;   //newLink ---> old first
	           first = newNode;  //first ---> newNode
	    }
	 
	    /**
	     * Deletes first Node
	     */
	    public Node<T> deleteFirst()
	    {
	           if(first==null){  //means LinkedList in empty, throw exception.              
	                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
	           }
	           Node<T> tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
	           first = first.next; // delete first Node (make first point to second node)
	           return tempNode; // return tempNode (i.e. deleted Node)
	    }
	    
	           
	    /**
	     * Display LinkedList
	     */
	    public void displayLinkedList() {
	           System.out.print("Displaying LinkedList [first--->last]: ");
	           Node<T> tempDisplay = first; // start at the beginning of linkedList
	           while (tempDisplay != null){ // Executes until we don't find end of list.
	                  tempDisplay.displayNode();
	                  tempDisplay = tempDisplay.next; // move to next Node
	           }
	           System.out.println();
	           
	    }
	 
	}
	 
	  
	    
	
	 


