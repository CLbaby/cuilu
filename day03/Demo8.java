package day03;
import java.util.Scanner;
/**
 * 赋值运算
 * */
public class Demo8 {

	public static void main(String[] args) {
//		int a;
//		int b;
//		int c;
//		c = a = b = 3;		
//		c = a + (b = 1);	//b的值为1，括号里也是1 c的值4
//		//System.out.println(a+" "+b+" "+c);
//		a  = 1;
//		b+=a;	//b = b+a; 2
//		b*=a;//2
//		b/=a;//2
//		b%=a;//0
//		b = 2345;
//		System.out.println(b%=10000);
//		System.out.println(b%=1000);
//		System.out.println(b%=100);
//		System.out.println(b%=10);
		System.out.print("请输入一个四位数：");
		Scanner console = new Scanner(System.in);
		int b = console.nextInt();
		int a1 = b%10;
		b/=10;
		int a2 = b%10;
		b/=10;
		int a3= b%10;
		b/=10;
		int a4 = b%10;
		b/=10;
		int n = a1*1000+a2*100+a3*10+a4;
		System.out.println("四位分别是："+a4+","+a3+","+a2+","+a1);
		System.out.print("倒过来以后是酱紫哒："+n);
	}

}
