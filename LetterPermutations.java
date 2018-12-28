package TwoHour;

import java.util.ArrayList;



public class LetterPermutations {
	/*
	 ABCD 輸出所有排列組合 ex. A AB ABC ABCD ABD .... 
	 */
	
	public static String exe(String [] str) {			
		 ArrayList<String> resualf = new ArrayList<String>();
		//                     //		
	     int len = str.length;
		 int nb = 1<<len;
		 String s="";
	     for(int i=0;i<nb;i++) {
	    	 for(int j=0;j<len;j++) {
	    		 int a=1<<j;
	    		 if((a&i)!=0) {
	    			 s+=str[j];
	    		 }
	    	 }
	    	 if(s!="") {
	    	 resualf.add(s);
	    	 }
	    	 s="";
	     }
 
		//                     //
		return resualf.toString();
		}
		
	    public static void main(String[] args) {
	    	    	
	    	String [] str = {"A","B","C","D"};
	    	System.out.println("Your Ans = ");
	    	System.out.println(LetterPermutations.exe(str));
	    	
	    }
}
