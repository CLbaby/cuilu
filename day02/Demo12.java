package day02;
import java.util.Random;
/**
 * ��������ַ�
 * ���ɴ�'A' ~ 'Z'��Χ��ĳ���ַ�----------��֤�룡
 * 1.�ַ���һ���������Ծ��൱������65~90����
 *  65~90 = 65+��0~25�� = 65+[0,26)
 *  
 *  ��ʾ���ַ���һ�����������Խ��мӼ�����
 *  ��ʾ��java������API�����ķ�Χ�������ǰ�����ʼ������������
 * */
public class Demo12 {
	public static void main(String[] args){
		Random random = new Random();
		int n = random.nextInt(26);		//��java�����е�
		//���ɴ�[0,26����Χ�ڵ��������������26
		char ch = (char)('A'+n);
		//ch = (char)('A'+random.nextInt(26));
		System.out.println(ch);	//'A'~'Z'
	}
}
