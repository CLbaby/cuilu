package day02;
import java.util.Scanner;
/**
 * 
 * */
public class Demo9 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("������λ�ƣ�");
		double s = console.nextDouble();
		double g = 9.8;
		double a = 2*s/g;
		double t = Math.sqrt(a);
		//double t = math.sqrt(2*s/g);	//��n���п�ƽ������
		System.out.println("������"+t+"��");
		//Math�����ṩ�˳�������ѧ����		
	}
}
