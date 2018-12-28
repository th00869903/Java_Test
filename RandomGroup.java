package Test;

import java.util.*;
public class RandomGroup {
	
	/*已知有八支男子足球隊參加2008 北京奧運會。寫一個程序，把這8 支球隊隨機分為2 個組。採用List集合和隨機數
	2008 北京奧運會男足參賽國家：
	A，B，C，D，E，F、G，H*/
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
		arr.add("F");
		arr.add("G");
		arr.add("H");
		
		Random a = new Random();
		for(int i = 0 ; i<4 ; i++) {
			System.out.print("第"+(i+1)+"組"+" ");
			for(int j = 0 ; j<2 ; j++) {
				
				String str = arr.get(a.nextInt(arr.size()));
				System.out.print(str+" ");		
				arr.remove(str);
			}
			System.out.println();			
		}
		
	}

}
