package day03;
import java.util.Scanner;
/**
 * switch-case
 * ֻ�ܴ���������byte short long int char���߼��ж�
 * */
public class Demo14 {

	public static void main(String[] args) {
//		int score = 80;	//�����ǰٷ���
		System.out.println("������һ��������");
		Scanner console = new Scanner(System.in);
		int score = console.nextInt();		
		//0~10
		switch(score/10){
		case 10:
			//�������
		case 9:
			System.out.print("����"); 
			break;
		case 8:
			System.out.print("����");
			break;		
		case 7:
			System.out.print("�е�"); 
			break;
		case 6:
			System.out.print("����"); 
			break;
		default:System.out.print("������"); 
			
		}
	}

}
