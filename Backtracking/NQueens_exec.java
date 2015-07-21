package Backtracking;

import java.util.Scanner;

class NQueens{
	int board[][];
	int size;
	NQueens(int n){
		size = n;
		board = new int[n][n];
	}
	
	public boolean isSafe(int row,int col){
		for(int c=col-1;c>=0;c--){
			if(board[row][c]==1){
				return false;
			}
		}
		
		for(int r=row-1,c=col-1;r>=0&&c>=0;r--,c--){
			if(board[r][c]==1){
				return false;
			}
		}
		
		for(int r=row+1,c=col-1;r<size&&c>=0;r++,c--){
			if(board[r][c]==1){
				return false;
			}
		}
		
		return true;
	}
	
	public void placeQueens(){
		place(0);
		printBoard();
	}
	
	public boolean place(int col){
			if(col>=size){
				return true;
			}
			
			for(int row=0;row<size;row++){
				
				if(isSafe(row,col)){
					board[row][col]=1;
				}
				else{
					continue;
				}
				
				if(place(col+1)){
					return true;
				}
				else{
					board[row][col]=0;
				}
			}
			
			return false;
		}
	
	public void printBoard(){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(board[i][j]==0?'.':'Q');
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

public class NQueens_exec {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the board Size");
		int n = s.nextInt();
		NQueens nq = new NQueens(n);
		nq.placeQueens();
		
	}

}
