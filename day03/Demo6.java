package day03;
import java.util.Scanner;
/**
 *��Ŀ�����
 * */
public class Demo6 {

	public static void main(String[] args) {
		System.out.print("�������������������ÿո������");
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();
		
		int max = a>b ? a:b;	//����a b�����ֵ	
		//System.out.println(max);
		max = (a>b ? a:b)>c ? (a>b ? a:b):c;	//max = max>c ? max:c;
		System.out.println("���ֵΪ��"+max);
		
	}

}
