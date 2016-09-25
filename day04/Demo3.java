package day04;
/**
 * n个9的和
 * sum=9+99+999+...
 */
public class Demo3 {

	public static void main(String[] args) {
		int i = 1;
		long num = 1;
		long sum = 0;		
		//---------while-------//
//		while(i<=11){
//			num = num*10;
//			long x = num - 1;
//			System.out.println(x);	//跟踪语句
//			sum+=x;
//			i++;	//保证循环能够结束
//		}
//		System.out.print(sum);		
		
		//-----------FOR-----------//
		for(i=1;i<=9;i++){
			num = num*10;
			long x = num-1;
			sum = sum+x;
			System.out.println(x);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
