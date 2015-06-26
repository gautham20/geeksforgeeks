package stack;

public class TowerofHanoiRecursive {
	
	public static void towerofHanoi(int n,char from,char to,char mid){
		if(n==1){ 
			System.out.println("move disk 1 from "+from+" to "+to);
			return;
		}
		towerofHanoi(n-1,from,mid,to);
		System.out.println("move disk "+n+" from "+from+" to "+to);
		towerofHanoi(n-1,mid,to,from);
	}
	
	public static void main(String args[]){
		int n = 3;
		towerofHanoi(n,'A','C','B');
	}

}
