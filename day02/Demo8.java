package day02;
import java.util.Scanner;

/**
 * 自由落体运动的位移
 * */
public class Demo8 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入时间：");
		double t = console.nextDouble();	//控制台读取一个浮点数   console是控制台
		double g = 9.8;
		double s;
		s = g*t*t/2;
		System.out.println("下落了"+t+"秒");
		System.out.println("移动了"+s+"米");
				
	}

}
