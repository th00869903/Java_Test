package Test;

public class NarcissisticNum {

	/*ゴ┮Τ"计"┮孔"计"琌计ㄤ计ミよ㎝单赣计セō*/
	public static void main(String[] args) {
		
		int sum;
		for(int i = 1;i<=9;i++) {
			for(int j = 0;j<=9;j++ ) {
				for(int k = 0;k<=9;k++) {
					sum = (i*i*i)+(j*j*j)+(k*k*k);
					if(sum == (i*100)+(j*10)+k)
						System.out.println(sum);
				}
			}
		}
		
	
	}

}
