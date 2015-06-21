package linked_list;

//In java its always pass by reference for objects
//EXTREMELY IMPORTANT http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
//All the special cases involving the head can be easily overcome by using a dummy node, which is not implemented in this program

class node{
	int data;
	node next;
	node(){
		data = Integer.MIN_VALUE;
		next = null;
	}
	
	node(int data){
		this.data = data;
	}
}

public class insertionDeletion {
	
	public static node insert(node head,int data){
		if(head.data==Integer.MIN_VALUE){
			head.data = data;
			return head;
		}
		
		node newNode = new node(data);
		newNode.next = head;
		head = newNode;		
		return head;
	}
	
	public static node insertAt(node head,int position,int data){
		position--; //converting to index zero
		if(head.data==Integer.MIN_VALUE&&position!=0){
			System.out.println("not possible");
			return head;
		}
		
		if(head.data==Integer.MIN_VALUE || position==0){
			return insert(head,data);
		}
		
		node current = head,prev=null;
		while(current!=null && position>0){
			prev = current;
			current=current.next;
			position--;
		}
		
		if(position!=0){
			System.out.println("index error");
			return head;
		}
		
		node newnode = new node(data);
		prev.next = newnode;
		newnode.next = current;
		return head;
	}
	
	public static node insertLast(node head,int data){		
		if(head.data==Integer.MIN_VALUE){
			return insert(head,data);
		}
		
		node current = head;
		node newNode = new node(data);
		while(current.next!=null){
			current=current.next;
		}
		current.next = newNode;
		return head;
	}
	
	public static void printList(node head){  //no need of temp, because the function cannot
		if(head.data==Integer.MIN_VALUE){    //change where head points to
			System.out.println("No elements");
		}
		while(head!=null){
			if(head.data!=Integer.MIN_VALUE){
			System.out.print(head.data+" ");
			}
			head = head.next;
		}
		System.out.println();
	}
	
	public static node deleteHead(node head){
		head = head.next;
		return head;
	}
	
	public static node deleteKey(node head,int key){
		if(head.data==Integer.MIN_VALUE){
			System.out.println("no elements");
			return head;
		}
		
		if(head.data==key){
			return deleteHead(head);
		}
		node current = head, prev = null;
		boolean found = false;
		while(current!=null){
			if(current.data==key){
				found = true;
				break;
			}
			prev = current;
			current = current.next;
		}
		if(found){
			prev.next = current.next;
		}
		else{
			System.out.println("element not found");
		}
		return head;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insert(head,10);
		head = insert(head,20);
		System.out.println(head.data);
		head = insertAt(head,3,13);
		head = insertLast(head,50);
		printList(head);
		head = deleteKey(head,13);
		printList(head);
		
	}
}
