package day02;
import java.util.Scanner;

/**
 * ���������˶���λ��
 * */
public class Demo8 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("������ʱ�䣺");
		double t = console.nextDouble();	//����̨��ȡһ��������   console�ǿ���̨
		double g = 9.8;
		double s;
		s = g*t*t/2;
		System.out.println("������"+t+"��");
		System.out.println("�ƶ���"+s+"��");
				
	}

}
