package Test;

import java.util.*;
public class Classification {

	/* �z�L�u��L��J�v�ǥͪ����ơA1~100�æA���ӼзǤ����u�u(~90)�B�}(80)�B��(60)�B�t(60~)�v�|�ӯŧO�C */	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��J����(0~100���) = ");
		int a = sc.nextInt();
		
		int b = (a/10);
	
		System.out.println("���ƯŧO");
		switch(b) {
		case 10 :
		case 9 : System.out.println("�u");
		break;
		case 8 : System.out.println("�}");
		break;
		case 7 :
		case 6 :  System.out.println("��");
		break;
		default : System.out.println("�t");
		break;		
		}
				
	}

}
