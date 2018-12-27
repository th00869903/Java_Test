package Test;

import java.util.*;
public class Classification {

	/* 透過「鍵盤輸入」學生的分數，1~100並再按照標準分成「優(~90)、良(80)、中(60)、差(60~)」四個級別。 */	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入分數(0~100整數) = ");
		int a = sc.nextInt();
		
		int b = (a/10);
	
		System.out.println("分數級別");
		switch(b) {
		case 10 :
		case 9 : System.out.println("優");
		break;
		case 8 : System.out.println("良");
		break;
		case 7 :
		case 6 :  System.out.println("中");
		break;
		default : System.out.println("差");
		break;		
		}
				
	}

}
