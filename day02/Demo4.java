package day02;
/**
 * ���������ظ�����������=���壩
 * ��ͬһ���������в����ظ���������
 * */
public class Demo4 {

	public static void main(String[] args) {
		int age = 12;
		System.out.println(age);
		//int age = 15;	//������󣺱���age�ظ�����
		age = 15;	//�����ĸ�ֵ
		{
			//int age = 18;	//����������age�ظ�����
			int rank = 12;
			System.out.println(rank);
		}
		int rank = 18;	//�������� 
		System.out.println(rank);
	}
}
