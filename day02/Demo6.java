package day02;
/**
 * long��������
 * ��Χ��-2^63 ~ 2^63-1
 * 1970.1.1���������ۼƵĺ�������ʱ��
 * */
public class Demo6 {

	public static void main(String[] args) {
		//long l1 = 10000000000000;	//������� ��������������int��Χ��
		long l1 = 10000000000000L;	//LΪ��׺����������long����
		long now = System.currentTimeMillis();	
		//��1970��Ԫ�������ڣ���������ڼ��ʱ�˿̣��ۼƵĺ�����
		System.out.println(now);	//
		long year = now/1000/60/60/24/365+1970;
		System.out.println("��Ԫ"+year);
		
		long max = 0x7fffffffffffffffL;	//һ��7 15��f 16����MAX��д��
		long finalyear = max/1000/60/60/24/365+1970;	//long�������ܹ���ʾ�Ĺ�Ԫ���
		System.out.println("��Ԫ"+finalyear);
	}
}
