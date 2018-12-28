package Test; 

import java.util.*;

public class decomposition {

/*將一個正整數分解質因數。例如：輸入90,打印出90=2*3*3*5。*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("輸入一個正整數 : ");
		int Num = sc.nextInt();
		
		TEST(Num);

	}
	
	public static void TEST(int x) {
		int a = 2;
		
		if(x<=1)
			System.out.println(x+"無法質因數分解");
		
		else if(x<=2)
			System.out.println(x+"= 1"+"*"+a);
		else
			System.out.print(x+"= 1");
			while(a<=x) {
				if(x%a==0) {
					System.out.print("*"+a);
				    x=x/a;
				    }
				else
					a++;
			}
	}
	

}
