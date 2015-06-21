package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;


class Palindrome_ssl{
	
	private node left;
	
	public boolean isPalindrome(node head){
		left = head;
		boolean isPalin = isPalindromeUtil(head);
		left = null;
		return isPalin;
	}
	
	private boolean isPalindromeUtil(node right){
		if(right==null){
			return true;
		}
		boolean isp = isPalindromeUtil(right.next);
		if(!isp){
			return false;
		}
		
		if(left.data==right.data){
			left = left.next;
			return true;
		}
		
		return false;	
	}
}
	
public class palindromeExec {
	
	public static void main(String args[]){
		Palindrome_ssl pl = new Palindrome_ssl(); 
		node head = new node();
		head = insertionDeletion.insert(head,11);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,11);
		insertionDeletion.printList(head);
		if(pl.isPalindrome(head)){
			System.out.println("is a palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}
