package day03;
import java.util.Scanner;
/**
 * 计算分页数量
 * 查询结果rows为：36行
 * 如果每页有10行 ，size
 * 计算分页以后的数量
 * 分析：如果行数能够被页数整除，结果就是rows/size；否则，rows/size+1
 * 
 * */
public class Demo7 {

	public static void main(String[] args) {
		System.out.print("请输入条数：");
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		int size = 10;
		int pages = (rows%size!=0)? rows/size+1 : rows/size;
		System.out.println("页数为"+pages+"页");
		

	}

}
