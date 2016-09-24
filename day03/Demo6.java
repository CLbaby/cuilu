package day03;
import java.util.Scanner;
/**
 *三目运算符
 * */
public class Demo6 {

	public static void main(String[] args) {
		System.out.print("请输入三个整数，并用空格隔开：");
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();
		
		int max = a>b ? a:b;	//计算a b的最大值	
		//System.out.println(max);
		max = (a>b ? a:b)>c ? (a>b ? a:b):c;	//max = max>c ? max:c;
		System.out.println("最大值为："+max);
		
	}

}
