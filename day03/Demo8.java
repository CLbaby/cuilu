package day03;
import java.util.Scanner;
/**
 * ��ֵ����
 * */
public class Demo8 {

	public static void main(String[] args) {
//		int a;
//		int b;
//		int c;
//		c = a = b = 3;		
//		c = a + (b = 1);	//b��ֵΪ1��������Ҳ��1 c��ֵ4
//		//System.out.println(a+" "+b+" "+c);
//		a  = 1;
//		b+=a;	//b = b+a; 2
//		b*=a;//2
//		b/=a;//2
//		b%=a;//0
//		b = 2345;
//		System.out.println(b%=10000);
//		System.out.println(b%=1000);
//		System.out.println(b%=100);
//		System.out.println(b%=10);
		System.out.print("������һ����λ����");
		Scanner console = new Scanner(System.in);
		int b = console.nextInt();
		int a1 = b%10;
		b/=10;
		int a2 = b%10;
		b/=10;
		int a3= b%10;
		b/=10;
		int a4 = b%10;
		b/=10;
		int n = a1*1000+a2*100+a3*10+a4;
		System.out.println("��λ�ֱ��ǣ�"+a4+","+a3+","+a2+","+a1);
		System.out.print("�������Ժ��ǽ����գ�"+n);
	}

}
