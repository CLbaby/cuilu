package day03;
import java.util.Scanner;
/**
 * switch-case
 * 只能处理整数（byte short long int char）逻辑判断
 * */
public class Demo14 {

	public static void main(String[] args) {
//		int score = 80;	//分数是百分制
		System.out.println("请输入一个分数：");
		Scanner console = new Scanner(System.in);
		int score = console.nextInt();		
		//0~10
		switch(score/10){
		case 10:
			//合理输出
		case 9:
			System.out.print("优秀"); 
			break;
		case 8:
			System.out.print("良好");
			break;		
		case 7:
			System.out.print("中等"); 
			break;
		case 6:
			System.out.print("及格"); 
			break;
		default:System.out.print("不及格"); 
			
		}
	}

}
