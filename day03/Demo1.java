package day03;
/**
 * float��long��
 * float�ľ���û��long�ߣ���Чλ��=β���̣�
 * float�ķ�Χ����long��ָ�����Ժܴ�
 * ��Χ�ɳ��Ⱦ�������������Чλ�����Ⱦ���
 * */
public class Demo1 {

	public static void main(String[] args) {
		long l = 31415926535897932L;
		System.out.println(l);
		float f = l;	//������ʧ
		System.out.println(f);
		f = f*10000;
		l = (long)f;	
		System.out.println(l);	//�����ԶԶ����long�ķ�Χ
		
	}

}
