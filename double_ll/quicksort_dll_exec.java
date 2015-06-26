package double_ll;


import double_ll.dll_node;
import double_ll.double_ll;

class Quicksort_dll{
	double_ll<Integer> dll;
	
	Quicksort_dll(double_ll<Integer> dll){
		this.dll = dll;
	}
	
	public double_ll<Integer> quicksort_dll(){
		dll_node<Integer> curr = dll.head;
		while(curr.next!=null){
			curr = curr.next;
		}
		_quicksort(dll.head,curr);
		return dll;
	}
	
	private void _quicksort(dll_node<Integer> p, dll_node<Integer> r){
		
		if(p!=null && r!=null && p!=r && p != r.next){
			dll_node<Integer> q = partition(p,r);
			_quicksort(p,q);
			_quicksort(q.next,r);
		}
	}
	
	private dll_node<Integer> partition(dll_node<Integer> head,dll_node<Integer> last){
		int key = (int)last.data;
		dll_node<Integer> i = null;
		dll_node<Integer> j = head;
		while(j!=last){
			if(j.data<key){
				i=(i==null)?head:i.next;
				swap(i,j);
			}
			j = j.next;
		}
		i=(i==null)?head:i.next;
		swap(i,last);
		return i;
	}
	
	public void swap(dll_node<Integer> i,dll_node<Integer> last){
		int temp = i.data;
		i.data = last.data;
		last.data = temp;
	}

}

public class quicksort_dll_exec {
	
	public static void main(String args[]){
		double_ll<Integer> dll = new double_ll<Integer>(10);
		dll.insert(90);
		dll.insert(50);
		dll.insert(40);
		dll.print();
		Quicksort_dll q = new Quicksort_dll(dll);
		dll = q.quicksort_dll();
		dll.print();
	}
}
