package day05_1;
/**
 * ��������Ԫ��
 * */
public class Demo3 {

	public static void main(String[] args) {
		int[] ary1 = new int[]{3,4,5};
		//����ĳ�������length
		System.out.println(ary1.length);//3
		//������±귶Χ��0,1,2   ���һ��Ԫ�ص�λ����length-1
		//���������±귶Χ���ʻ�����쳣��
		System.out.println(ary1[0]);//3
		System.out.println(ary1[1]);//4
		System.out.println(ary1[2]);//5
		System.out.println(ary1[ary1.length-1]);//5
		//System.out.println(ary1[3]);//�����쳣���±�Խ�� 
		//���н���ǣ�A�������		B�����쳣		C 3		D 0			��B��
		
		ary1[0] = 8;	//�޸�����Ԫ��
		ary1[1]++;
		System.out.println(ary1[0]);//8	//��ȡ����Ԫ��
		System.out.println(ary1[1]);//5
		System.out.println(ary1[2]);//5
		
	}

}
