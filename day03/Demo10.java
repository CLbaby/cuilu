package day03;
import java.util.Scanner;
/**
 * �����жϳ���
 * 1.��4�����Ҳ��ܱ�100����
 * 2.�ܱ�400����
 * */
public class Demo10 {

	public static void main(String[] args) {
		System.out.println("������һ�����");
		Scanner console = new Scanner(System.in);
		int year = console.nextInt();
		
//		if(year%100==0){
//			System.out.println("������");
//		}else if(year%100!=0&&year%4==0){
//			System.out.println("������");
//		}else {
//			System.out.println("��������");
//		}
		boolean isLeapYear = false;
		//1.��4�����Ҳ��ܱ�100����  
		//(year%4==0)&& ��(year%100==0); ;
		//2.��400����
		// year%400==0
		//�ܱ��ʽ  1||2
		isLeapYear = ((year%4==0) && !(year%100==0))||(year%400==0);
		if(isLeapYear){
			System.out.print(year+"��������");
		}else{
			System.out.print("����"+year+"����������");
		}

	}

}