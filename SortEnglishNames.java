package TwoHour;

import java.util.ArrayList;
import java.util.Arrays;


public class SortEnglishNames {


	/*�^��W�r�Ƨ�
	 ("Ada,Alexandra,Tracy,Viola,Stephanie,Sherry,Vacky,Vurr")
	 ���󬰲Ĥ@�Ӧr���˧ǡA�ĤG�Ӧr������
	 */
	
	public static String exe(String str) {				
		String resulf = "";
		//                     //	
        String[] s =str.split(",");
        ArrayList<String> arr = new ArrayList<String>();
        
        Arrays.sort(s);
		
        String temp;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].charAt(0)==s[j].charAt(0)) {
					if(s[i].charAt(1)<s[j].charAt(1)){
						temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
		}
		for(String st:s) {
			arr.add(0,st);
		}
		resulf = arr.toString();
		//                     //
		return resulf;
	}

	    public static void main(String[] args) {
	    	    	
	    	System.out.println("Your Ans = ");
	    	System.out.println(SortEnglishNames.exe("Ada,Alexandra,Tracy,Viola,Stephanie,Sherry,Vacky,Vurr"));
	    	
	    }
		
	
}
