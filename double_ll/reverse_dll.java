package double_ll;

import double_ll.dll_node;
import double_ll.double_ll;

public class reverse_dll {
	
	public static double_ll reverse_dll(double_ll dll){
		if(dll.isEmpty()){
			System.out.println("empty lst");
			return null;
		}
		
		dll_node prev = null;
		dll_node curr = dll.head;
		while(curr!=null){
			
			curr.prev = curr.next;
			curr.next = prev;
			prev = curr;
			curr = curr.prev;
			
		}
		
		if(prev!=null){
			dll.head = prev;
		}
		
		
		return dll;
	}
	
	public static void main(String args[]){
		double_ll<Integer> dll = new double_ll<Integer>(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.print();
		dll = reverse_dll(dll);
		dll.print();
	}
}
