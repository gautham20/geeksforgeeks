package stack;

class Stackspl extends Stack<Integer>{
	char name;
	Stackspl(char name){
		this.name = name;
	}
}

public class towerofHanoiIteration {
	
	public static void topswap(Stackspl s1,Stackspl s2){
		if(s1.isEmpty() && s2.isEmpty()){
			System.out.println("illegal");
			return;
		}
		int temp;
		boolean s1tos2 = false;
		if(s1.isEmpty()){
			s1.push(temp=s2.pop());
		}
		
		else if(s2.isEmpty()){
			s2.push(temp=s1.pop());
			s1tos2 = true;
		}
		
		else if(s1.peek()>s2.peek()){
			s1.push(temp=s2.pop());
		}
		else{
			s2.push(temp=s1.pop());
			s1tos2 = true;
		}
		
		if(s1tos2){
			System.out.println("move disk "+temp+" from "+s1.name+" to "+s2.name);
		}
		else{
			System.out.println("move disk "+temp+" from "+s2.name+" to "+s1.name);
		}
		
	}
	
	public static void towerofHanoi(int n,char from,char mid,char to){
		Stackspl sfrom = new Stackspl(from);
		Stackspl smid = new Stackspl(mid);
		Stackspl sto = new Stackspl(to);
		for(int i=n;i>0;i--){
			sfrom.push(i);
		}
		if(n%2==0){
			smid.name = to;
			sto.name = mid;
		}
		int moves = (int) (Math.pow(2,n)-1);
		for(int i=1;i<=moves;i++){
			if(i%3==1){
				topswap(sfrom,sto);
			}
			if(i%3==2){
				topswap(sfrom,smid);
			}
			if(i%3==0){
				topswap(smid,sto);
			}
		}
	}
	
	public static void main(String args[]){
		int n=2;
		towerofHanoi(n,'a','b','c');
	}

}
