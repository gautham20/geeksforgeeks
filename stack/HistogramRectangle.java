package stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Stack;

public class HistogramRectangle {
    
	 public static long getArea(int[] arr){
	        Stack<Integer> stack = new Stack<Integer>();
	        long max = 0;
	        for(int i=0;i<arr.length;i++){
	            if(stack.isEmpty() ||  arr[stack.peek()]<=arr[i]){
	                stack.push(i);
	            }
	            else{
	                    //System.out.println(stack.peek());
	                    int nextsmall = i;
	                while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
	                    long cmax = (long)arr[stack.pop()];
	                    int len  = stack.isEmpty()? nextsmall : nextsmall - stack.peek() - 1;
	                    cmax*=len;
	                    if(cmax>max){
	                        max = cmax;
	                    }
	                }
	                stack.push(i);
	                }
	           // System.out.println(stack.toString());
	            }
	        
	        
	        
	        while(!stack.isEmpty()){
	            long cmax = arr[stack.pop()];
	            int len = stack.isEmpty()? arr.length : arr.length - 1 - stack.peek();
	            cmax*=len;
	            if(cmax>max){
	                max = cmax;
	            }
	        }
	        
	        return max;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = s.nextInt();
	        }
	        System.out.println(getArea(arr));
	        
	    }
	}