


    class Guess {
	private int[] guess ; //�ŧi�q���Ʀr
	int Min,Max,Answer,Mytime = 0;
	//�إ߰t�m,�ó]�w��l��0
    	public Guess(int num,int min,int max,int answer) {
    		guess = new int[num];
    		for(int i=0;i<guess.length;i++)
    		{
    			guess[i]=0;
    		}
    		   Min=min;
    		   Max=max;
    		   Answer=answer;
   		
    	}
	 	  	 	
    	//�}�l�q�Ʀr,�ñN�q�L�Ʀr�s�J
    	public void startguess() {
    		java.util.Scanner scanner1 = new java.util.Scanner(System.in);   		  		  		
    		
            for(int i = 0; i<guess.length ;i++) {					
   								
   			System.out.print("�вq�X�d��"+Min+"~"+Max+"�����: ");			
   			guess[i] = scanner1.nextInt();		
   			 			
   			if(guess[i]<Min || guess[i]>Max) {
   				System.out.println("�W�X�d��F");
   				Mytime++;
   			}		
   			if(guess[i]<Answer && guess[i]>Min) {
   				System.out.println("�Ӥp�F");
   				Min=guess[i];
   				Mytime++;
   			}
   			if(guess[i]>Answer && guess[i]<Max) {
   				System.out.println("�Ӥj�F");
   				Max=guess[i];
   				Mytime++;
   			}
   			if(guess[i] == Answer ) {
   				System.out.println("���߱z�q��F");	
   				Mytime++;
   				break;
   			}
   			
   		}
           		
    	}
    	
    	public void overguess(){
    		
    		for(int i = 0; i<guess.length ;i++) {		
    			System.out.println("��"+(i+1)+"�q :"+guess[i]);		
    			}
    			
    			System.out.println("----");
    			System.out.println("�q�Ʀr���"+(guess.length)+"��");
    			System.out.println("�A�q�����Ƭ�"+Mytime+"��");
    			System.out.println("���T���׬�:"+Answer);
    		
    	}
    	
    	    		
}

public class hw4 {
	public static void main(String[] args) {
		java.util.Scanner scanner2 = new java.util.Scanner(System.in);				
			int a;
		do {
		System.out.println("�w��Ө�Alan�q�Ʀr�C��!!");
		
		System.out.print("�]�w�̤p�� :");
		int min = scanner2.nextInt();
		
		System.out.print("�]�w�̤j�� :");
		int max = scanner2.nextInt();
		
		System.out.print("�]�w�q������ :");
		int num = scanner2.nextInt();
		
		int answer = (int)(Math.random() * (max - min +1))+min;	
		
		Guess gu = new Guess(num,min,max,answer);
		System.out.println("******�C���}�l******");	
		gu.startguess();
		
		System.out.println("******�C������******");
		gu.overguess();
		
		System.out.println("******�A���@��(Y/N)?******");
		String S1 = scanner2.next();
				if(S1.equals("Y")||S1.equals("y")) 
				{
					a=0;
				}
				else
				{
					a=1;
				}
		}while(a==0);
		
	}
	
}
