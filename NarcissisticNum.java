package Test;

public class NarcissisticNum {

	/*���L�X�Ҧ���"���P���"�A�ҿ�"���P���"�O���@�ӤT��ơA��U��Ʀr�ߤ�M����Ӽƥ���*/
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
