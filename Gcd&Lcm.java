package Test;

import java.util.*;
public class TEST3 {
	/*�̤j���]�ƻP�̤p������*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J��Ӿ��");
		System.out.print("m = ");
		int m =sc.nextInt();
		System.out.print("n = ");
		int n =sc.nextInt();
		System.out.println("GCD :" + gcd(m,n));
		System.out.println("LCM :" + lcm(m,n));
				
}

	public static int gcd(int m , int n) {
		if(n == 0)
		return m;
		else
		return gcd(n,m%n);
	}
	public static int lcm(int m , int n ) {
		return (m*n / gcd(n,m%n));
	}
	
	
		
	
}