package day03;
import java.util.Scanner;
/**
 * 闰年判断程序
 * 1.被4整除且不能被100整除
 * 2.能被400整除
 * */
public class Demo10 {

	public static void main(String[] args) {
		System.out.println("请输入一个年份");
		Scanner console = new Scanner(System.in);
		int year = console.nextInt();
		
//		if(year%100==0){
//			System.out.println("是闰年");
//		}else if(year%100!=0&&year%4==0){
//			System.out.println("是闰年");
//		}else {
//			System.out.println("不是闰年");
//		}
		boolean isLeapYear = false;
		//1.被4整除且不能被100整除  
		//(year%4==0)&& ！(year%100==0); ;
		//2.被400整除
		// year%400==0
		//总表达式  1||2
		isLeapYear = ((year%4==0) && !(year%100==0))||(year%400==0);
		if(isLeapYear){
			System.out.print(year+"年是闰年");
		}else{
			System.out.print("笨！"+year+"不年是闰年");
		}

	}

}