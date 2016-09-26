package day05_1;
import java.util.Scanner;
/**
 * 改编
 * */
public class Demo1 {

	public static void main(String[] args) {
		String str = null;
		Scanner console = new Scanner(System.in);
	
		boolean flag = true;
		while(flag){
			System.out.println("请输入一个数：");
			str = console.nextLine();
			char c = str.charAt(0);
			if(c>='0'&&c<='9'){
				flag=false;
			}else System.out.println("输入错误！");
			
		}
		System.out.println(str);
	}

}
