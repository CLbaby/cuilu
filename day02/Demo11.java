package day02;
/**
 * ������������ת��
 * */
public class Demo11 {

	public static void main(String[] args) {
		//�Զ�����ת������С����
		long l = 1;		//int��32�� �Զ�ת��Ϊlong���ͣ�64������ֵ���˱���l
		l = 1024L*1024*1024*4;
		int i = (int)l;		//ǿ������ת��
		System.out.println(i);	//���,����
		l = 1000L;
		i = (int)l;
		System.out.println(i);

	}

}
