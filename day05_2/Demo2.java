package day05_2;
import java.util.Scanner;
/**
 * 쳲���������	1,1,2,3,5,8
 * ��쳲��������е�n��ֵ
 * �㷨���ӵ�һ�ʼ�ۼ������n��
 * 1����� n=1����n=2 ����1
 * 2���涨 f����ǰ��	�ӵ����ʼ����
 * 	    �涨 f0����ǰǰһ��
 * 	    �涨 f1����ǰһ��
 * 	    ���㣺i=3~n��f=f1+f0
 * 3)��f0=f1;f1=f ʵ��ǰ�������ֵ�ƶ�				
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
