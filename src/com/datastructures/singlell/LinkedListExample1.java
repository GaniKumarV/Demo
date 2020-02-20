package com.datastructures.singlell;

public class LinkedListExample1 {

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node node = new Node(data);

		if (head == null) {

			head = node;
			tail = node;
		} else {

			tail.next = node;
			tail = node;

		}
	}
	
	public int countNodes() {
		
		int count =0;
		Node node =head;
		
		while(node!=null) {
			
			count++;
			node=node.next;
			
		}
		return count;
	}
	
	
	 //reverse() will help the reverse the order of the list  
    public void reverse(Node current) {  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks if the next node is null, if yes then prints it.  
            if(current.next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }  
            //Recursively calls the reverse function  
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    }  
    
    public void deleteFromStart() {
    	
    	if(head==null) {
    		
    		System.out.println("List is empty::::");
    		return;
    	}
    	else {
    		
    		if(head!=tail) {
    			
    			head=head.next;
    		}else {
    			
    			head=tail=null;
    		}
    	}
    }
	public void display() {

		Node node = head;

		if (head == null) {

			System.out.println("list is empty::::::");
			return;
		}

		while (node != null) {

			System.out.print(node.data + "\n");

			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListExample1 example1 = new LinkedListExample1();
		example1.addNode(100);
		example1.addNode(200);
		example1.addNode(300);
		example1.addNode(400);
		example1.display();
		//Counts the nodes present in the given list    
        System.out.println("Count of nodes present in the list: " + example1.countNodes()); 
        
        System.out.println("reverse the list::::");
        example1.reverse(example1.head);
        
        
        	example1.deleteFromStart();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            example1.display();  
          
	}
}
