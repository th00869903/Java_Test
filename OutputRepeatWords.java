package TwoHour;

import java.util.ArrayList;
import java.util.HashMap;


public class OutputRepeatWords {
	/*
	 (There was once a shoemaker,who worked very hard and was very honest,but still he could not earn enough to live upon;and at last all he had in the world was gone,save just leather enough to make one pair of shoes.Then he cut his leather out,all ready to make up the next day,meaning to rise early in the morning to his work.His conscience was clear and his heart light amidst all his troubles,so he went peaceably to bed,left all his cares to Heaven,and soon fell asleep.)  
	 文章找出最高與次高出現單字(區分大小寫與去除符號)與出現次數
	 */
	
	public static String exe(String str) {			
		String resualf = "";
		//                     //		
        String[] s = str.replace(",", " ").replace(".", " ").replace(";", " ").split(" ");
		ArrayList<String> arr = new ArrayList<String>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String st:s) {
			if(hm.containsKey(st)) {
				int a =hm.get(st);
				a++;
				hm.put(st, a);
			}
			else {
				hm.put(st,1);
				arr.add(st);
			}
		}
		
		int fir =0;
		int sec =0;
		for(int i=0;i<arr.size();i++) {
			int b=hm.get(arr.get(i));
			if(b>fir) {
				fir=b;
			}
		}
		for(int i=0;i<arr.size();i++) {
			int c=hm.get(arr.get(i));
			if(fir>c && c>sec) {
				sec=c;
			}
		}
		
		ArrayList<String> first =new ArrayList<String>();
		ArrayList<String> second =new ArrayList<String>();
		
		for(String st:arr) {
			if(hm.get(st)==fir) {
				first.add(st);
			}
			if(hm.get(st)==sec) {
				second.add(st);
			}
		}
		for(String st:first) {
			resualf+=st+"("+fir+")"+"\n";
		}
		for(String st:second) {
			resualf+=st+"("+sec+")"+"\n";
		}	
		//                     //
		return resualf;	    
	}
				
	    public static void main(String[] args) {
	    	    	
	    	String str = ("There was once a shoemaker,who worked very hard and was very honest,but still he could not earn enough to live upon;and at last all he had in the world was gone,save just leather enough to make one pair of shoes.Then he cut his leather out,all ready to make up the next day,meaning to rise early in the morning to his work.His conscience was clear and his heart light amidst all his troubles,so he went peaceably to bed,left all his cares to Heaven,and soon fell asleep.");
	    	System.out.println("Your Ans = ");
	    	System.out.println(OutputRepeatWords.exe(str));
}
}
