package day03;
import java.util.Scanner;
/**
 * �����ҳ����
 * ��ѯ���rowsΪ��36��
 * ���ÿҳ��10�� ��size
 * �����ҳ�Ժ������
 * ��������������ܹ���ҳ���������������rows/size������rows/size+1
 * 
 * */
public class Demo7 {

	public static void main(String[] args) {
		System.out.print("������������");
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		int size = 10;
		int pages = (rows%size!=0)? rows/size+1 : rows/size;
		System.out.println("ҳ��Ϊ"+pages+"ҳ");
		

	}

}
