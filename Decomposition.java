package Test; 

import java.util.*;

public class decomposition {

/*�N�@�ӥ���Ƥ��ѽ�]�ơC�Ҧp�G��J90,���L�X90=2*3*3*5�C*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("��J�@�ӥ���� : ");
		int Num = sc.nextInt();
		
		TEST(Num);

	}
	
	public static void TEST(int x) {
		int a = 2;
		
		if(x<=1)
			System.out.println(x+"�L�k��]�Ƥ���");
		
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
