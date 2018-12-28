package TwoHour;

import java.util.Scanner;



public class ContinuousIntSum {
	/*
	 連續整數和
	 */
	
	public static String exe(int Int) {			
		String resualf = "";		 
		//                     //			
		int tail=1;
		int top=1;
		int sum=1;
		int a=1;
	    while(a<=(Int/2)+1) {
	    	if(sum>Int) {
	    		sum-=tail;
	    		tail++;
	    	}
	    	if(sum<Int) {
	    		a++;
	    		sum+=a;
	    		top++;
	    	}
	    	if(sum==Int) {
	    		for(int i=tail;i<=top;i++) {
	    			if(i==top) {
	    				resualf+=i+"="+Int+"\n";
	    			}
	    			else {
	    				resualf+=i+"+";
	    			}
	    		}
	    		a++;
	    		sum+=a;
	    		top++;
	    	}
	    }	
		//                     //
		return resualf;
	 }
		
	    public static void main(String[] args) {
	    	    	
	    	Scanner sc = new Scanner(System.in);
	    	int num = sc.nextInt();
	    	System.out.println("Your Ans = ");
	    	System.out.println(ContinuousIntSum.exe(num));
	    	
	    }
}
