package day03;
/**
 * ��ϵ���� �߼�����  
 * */
public class Demo4 {

	public static void main(String[] args) {
		char c = 'A';
		boolean b = c>'D';
		System.out.println(b);	//false
		boolean b1 = c<='Z';	//true
		
		char ch = '6';// 65 >= 48 && 65 <= 57
		boolean isNumber = ch>='0' && ch <='9';
		//�ж�һ���ַ��Ƿ��������ַ���'0'~'9'��
		//�ж�����ַ��ı�����ֵ���ڣ�48~57��֮��
		//				  48<=N<=57
		//      		48<=N ����   N<=57
		
		System.out.println(isNumber);
		//�ж�һ���ַ��Ƿ��Ǵ�д�ַ�
		char ch1 ='2';
		boolean isCapital = ch1>='A'&&ch1<='Z';
		System.out.println(isCapital);
		/**
		 * Сѧ��ĸ��
		 * char ch2 = '3';
		 * boolean isCapital = ch>='a' && ch<='Z';
		 * System.out println(isCapital);
		 * */
	}

}
