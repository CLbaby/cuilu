package day03;
import java.util.Scanner;
/**
 * ��֧��䣺
 * �����������е����ֵ a b c
 * */
public class Demo11 {

	public static void main(String[] args) {
		System.out.println("�������������� ���Կո�ָ�����");
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();
		
//		int max = 0;
//		if(a>b){
//			max = a;
//		}else{
//			max = b;
//		}
//		if(max<c){
//			max = c;
//		}
//		System.out.println(max);
		int max = (a>b?a:b)>c?(a<b?b:a):c;
		System.out.println(max);
	}

}
