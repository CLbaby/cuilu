package day05_1;
/**
 * ���� 
 * �����������
 * �����������
 * */
public class Demo2 {

	public static void main(String[] args) {
		//�����ʹ�������
		int[] ary;	//�����������ary
		ary = new int[3];	//����������󣬼�ƴ�������
		//ary=������󣺱�ʾary��ֵ�������������
		//ary�����ñ�����������һ���������new int[10]
		//�����Ǵ��ʣ�������һ�������ˣ������ǹ���ר�д���
		int[] ary2 = ary;	//���õĸ�ֵ����ֵ���ary2��ary������ͬһ���������
		//�ھӽ��ҵ������Ƕ�������˼���ǣ�����=���� �������������������ͬһֻ������
		//����������һ������
		ary[0] = 3;
		System.out.println(ary2[0]);	//3
	//����Ԫ�ص��Զ���ʼ�����󣺴�������ʱ������Ԫ���Զ���ʼ������ʼ��Ϊ0ֵ��0 0.0 false \u0000->����Ϊ0���ַ����ǿ����ַ�
	//
		int[] ary3 = new int[3];	//Ԫ���Զ���ʼ��Ϊ0
		System.out.println(ary3[0]);	//0
		System.out.println(ary3[1]);	//0
		System.out.println(ary3[2]);	//0
		double[] ary4 = new double[3];
		System.out.println(ary4[0]);	//0.0
		boolean[] ary5 = new boolean[3];
		System.out.println(ary5[0]);	//false
		char[] ary6 = new char[3];
		System.out.println(ary6[0]);	//�����ַ�\u0000��ʾ��Ч��!
		System.out.println((int)ary6[0]);	//0
		
	//��������ʱ��ֱ�ӳ�ʼ��Ԫ��
		int[] ary7 = new int[]{2,3,4};
		System.out.println(ary7[0]);	//2
	//����ľ�̬��ʼ�� ���򻯰��ʼ������Ԫ�أ�ֻ��������������ʱ��ֱ�Ӹ�ֵ���������ڸ�ֵ
		int[] ary8 ={2,3,4};
		//ary8 = {4,5,6};	//������󣬾�̬��ʼ������ֻ���ڳ�ʼ��ʱ��ֵ
		ary8 = new int[]{4,5,6};
		//{0,0,0} , new int[]{0,0,0} ��new int[3]
		//����3�����飬��û���κβ���~
		//����ʵ��ҵ����Ҫ�����ַ���������
		//�磬����10000��Ԫ�ص����飺��new int[10000];
		//�磬��֪�о���Ԫ�أ���{2,3,4}����new int[]{2,3,4}
				
	}

}
