 package day03;
/**
 * 实现n个数的累加和
 * sum = 1+2+3+...+10000;
 * */
public class Demo17 {
	
	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1;i<=1000;i++){
//			sum = sum+i;
//		}
//		System.out.print(sum);
		double PI = 0;
		double sum = 0;
		for(int i=1;i<100000000;i+=4){
			sum+=1.0/i-1.0/(i+2);		
		}
		PI = 4*sum;
		System.out.print(PI);
	}

}
