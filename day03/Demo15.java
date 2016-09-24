package day03;
import java.util.Scanner;
/**
 * 请选择如下功能：
 * 1.显示全部用户列表
 * 2.添加新用户
 * 3.修改用户的密码
 * 4.删除已经存在的用户
 * 0.离开系统
 * 请选择（0,1,2,3,4,）
 * */
public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请选择如下功能：");
		System.out.println("\t1 显示全部用户列表");	//制表符
		System.out.println("\t2 添加新用户");
		System.out.println("\t3修改用户的密码");
		System.out.println("\t4 删除已经存在的用户");
		System.out.println("\t0 离开系统");
		System.out.print("请选择(0,1,2,3,4,):");
		Scanner console = new Scanner (System.in);
		int command = console.nextInt();
		
		switch(command){
			case 1:
				System.out.println("显示全部用户列表");
				break;
			case 2:
				System.out.println("添加新用户");
				break;
			case 3:
				System.out.println("修改用户的密码");
				break;
			case 4:
				System.out.println("删除已经存在的用户");
				break;
			case 0:
				System.out.println("离开系统");
				break;
			default:System.out.println("指令错误！");
				
				
				
		}
		

	}

}
