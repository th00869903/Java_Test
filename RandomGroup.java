package Test;

import java.util.*;
public class RandomGroup {
	
	/*�w�����K��k�l���y���ѥ[2008 �_�ʶ��B�|�C�g�@�ӵ{�ǡA��o8 ��y���H������2 �ӲաC�ĥ�List���X�M�H����
	2008 �_�ʶ��B�|�k�����ɰ�a�G
	A�AB�AC�AD�AE�AF�BG�AH*/
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
			System.out.print("��"+(i+1)+"��"+" ");
			for(int j = 0 ; j<2 ; j++) {
				
				String str = arr.get(a.nextInt(arr.size()));
				System.out.print(str+" ");		
				arr.remove(str);
			}
			System.out.println();			
		}
		
	}

}
