package day04;
/**
 * 水仙花数问题
 * 1.如何将一个数拆开为个位数 
 * 	如:2365->2 3 6 5
 * 2.计算并判断水仙花数
 * 	2365 == 2^3 + 3^3 + 6^3 + 5^3
 * 3.判断一个范围内哪几个数是水仙花数
 */
public class Demo7 {

	public static void main(String[] args) {
		for(int i=1;i<1000;i++){
			int a = i%10;
			int b = (i/10)%10;
			int c = i/100;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.print(i+" ");
			}
		}		
	}
}
//方法2
//int num=153;
//int n=num;
//for(int i=1;i<10000;i++){
//	while(num!=0){
//		int d=num%10;
//		sum+=d*d*d;
//		num/10;  
//	}
//	if(sum==n){
//		system.out.print(n+"是水仙花数o~");	
//	}
//}












