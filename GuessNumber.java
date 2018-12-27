


    class Guess {
	private int[] guess ; //宣告猜的數字
	int Min,Max,Answer,Mytime = 0;
	//建立配置,並設定初始為0
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
	 	  	 	
    	//開始猜數字,並將猜過數字存入
    	public void startguess() {
    		java.util.Scanner scanner1 = new java.util.Scanner(System.in);   		  		  		
    		
            for(int i = 0; i<guess.length ;i++) {					
   								
   			System.out.print("請猜出範圍"+Min+"~"+Max+"的整數: ");			
   			guess[i] = scanner1.nextInt();		
   			 			
   			if(guess[i]<Min || guess[i]>Max) {
   				System.out.println("超出範圍了");
   				Mytime++;
   			}		
   			if(guess[i]<Answer && guess[i]>Min) {
   				System.out.println("太小了");
   				Min=guess[i];
   				Mytime++;
   			}
   			if(guess[i]>Answer && guess[i]<Max) {
   				System.out.println("太大了");
   				Max=guess[i];
   				Mytime++;
   			}
   			if(guess[i] == Answer ) {
   				System.out.println("恭喜您猜對了");	
   				Mytime++;
   				break;
   			}
   			
   		}
           		
    	}
    	
    	public void overguess(){
    		
    		for(int i = 0; i<guess.length ;i++) {		
    			System.out.println("第"+(i+1)+"猜 :"+guess[i]);		
    			}
    			
    			System.out.println("----");
    			System.out.println("猜數字限制為"+(guess.length)+"次");
    			System.out.println("你猜的次數為"+Mytime+"次");
    			System.out.println("正確答案為:"+Answer);
    		
    	}
    	
    	    		
}

public class hw4 {
	public static void main(String[] args) {
		java.util.Scanner scanner2 = new java.util.Scanner(System.in);				
			int a;
		do {
		System.out.println("歡迎來到Alan猜數字遊戲!!");
		
		System.out.print("設定最小值 :");
		int min = scanner2.nextInt();
		
		System.out.print("設定最大值 :");
		int max = scanner2.nextInt();
		
		System.out.print("設定猜的次數 :");
		int num = scanner2.nextInt();
		
		int answer = (int)(Math.random() * (max - min +1))+min;	
		
		Guess gu = new Guess(num,min,max,answer);
		System.out.println("******遊戲開始******");	
		gu.startguess();
		
		System.out.println("******遊戲結束******");
		gu.overguess();
		
		System.out.println("******再玩一次(Y/N)?******");
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
