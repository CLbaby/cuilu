package day02;
import java.util.Scanner;
/**
 * 
 * */
public class Demo9 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入位移：");
		double s = console.nextDouble();
		double g = 9.8;
		double a = 2*s/g;
		double t = Math.sqrt(a);
		//double t = math.sqrt(2*s/g);	//对n进行开平方计算
		System.out.println("下落了"+t+"秒");
		//Math类中提供了常见的数学函数		
	}
}
