package day05_1;
/**
 * ����ĵ�������
 * ���������������ǽ�����Ԫ����һ����һ��ķ���
 * */
public class Demo4 {

	public static void main(String[] args) {
		int[] ary = new int[]{1,1,2,3,5,8,13,21,34,55};	//length=8
		int sum = 0;
		for(int i=0;i<ary.length;i++){	//ʹ��ary.length ����Ӧ���鲻�����ӵ�Ԫ��
			sum = sum+ary[i];			
		}
		System.out.print(sum);
	}

}
