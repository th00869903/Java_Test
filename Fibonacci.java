package Test;

import java.util.*;
public class Fibonacci {

/* Fibonacci
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.....*/


	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Your number = ");
		int num = sc.nextInt();
		if(num < 3)
			System.out.println("Your Ans = "+num);
		else 
			System.out.println("Your Ans = "+Resnumber(num));
			
	}

	public static int Resnumber(int num) {
	
		int p1=1,p2=1;
        int res = 0;
        for(int i =3; i<=num;i++) {
        	res = p1+p2;
        	p1 = p2;
        	p2 = res;     	
        }
		
        return res;
		
	}
		
}
