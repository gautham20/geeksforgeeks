package double_ll;

import double_ll.dll_node;
import double_ll.double_ll;

public class swapKthNode {
	
	public static double_ll swap(double_ll<Integer> dll,int k){
		dll_node x,y,x_prev=null,y_prev=null;
		dll_node curr = dll.head;
		int steps = k;
		int n = 1;
		x = y = dll.head;
		while(curr!=null && steps>1){
			curr = curr.next;
			x_prev = x;
			x = x.next;
			steps--;
			n++;
		}
		if(curr!=null && steps==1 ){
			while(curr.next!=null){
				curr=curr.next;
				y_prev = y;
				y = y.next;
				n++;
			}
		}
		
		if(x==null || y==null){
			System.out.println("range overflow");
			return dll;
		}
		
		if(x==y){
			return dll;
		}
		x.prev = y_prev;
		if(x.prev!=null){
			x.prev.next = x;
		}
		y.prev = x_prev;
		
		if(y.prev!=null){
			y.prev.next = y;
		}
		dll_node temp = x.next;
		x.next = y.next;
		if(x.next!=null){
			x.next.prev = x;
		}
		y.next = temp;
		if(y.next!=null){
			y.next.prev = y;
		}
		if(k==1){
			dll.head = y;
		}
		if(k==n){
			dll.head = x;
		}
		return dll;
	}
	
	
	public static void main(String args[]){
		double_ll<Integer> dll = new double_ll<Integer>(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.print();
		dll = swap(dll,4);
		dll.print();
	}

}
