package day05_2;
import java.util.Scanner;
/**
 * 斐波那契数列	1,1,2,3,5,8
 * 求斐波那契数列第n项值
 * 算法：从第一项开始累加算出第n项
 * 1）如果 n=1或者n=2 返回1
 * 2）规定 f代表当前项	从第三项开始算起
 * 	    规定 f0代表前前一项
 * 	    规定 f1代表前一项
 * 	    计算：i=3~n：f=f1+f0
 * 3)将f0=f1;f1=f 实现前两项的数值移动				
 *	
 * 
 * */
public class Demo2 {
	public static int fibonacci (int n){
		int ans = 0;
		if(n==1){
			ans= 1;			
		}
		if(n==2){
			ans = 1;
		}if(n>=3){
			ans = (n-1)+fibonacci(n-2);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("please input a number:");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int num = fibonacci(n);
		System.out.println(num);

	}

}
