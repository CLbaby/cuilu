package day05_2;
/**
 * �����Ķ���
 * �������﷨�涨 û��Ϊʲô��
 * ʲô�Ƿ������ǿ����ظ�ʹ�õ��㷨���ܣ�y=sin(x)
 *  z=max(5,6) x=max(8,10)
 * ���������������ǰ������
 * ����ֵ�������ļ�����
 * 1�����������У������У�����
 */
public class Demo1 {
	/** ����x,y�����ֵ
	 * ���������빦������һ�£�һ��ʹ�ö���������
	 * һ��ʹ��Сд��ĸ��ͷ���ӵڶ������ʿ�ʼ�������������ĸ��д
	 * saveOrder()
	 * ����ֵ���������붨�巵��ֵ������޷���ֵ����void
	 * ��������˷���ֵ���ڷ����б���ʹ��return��䷵������
	 * �����Ƿ��������������壩�����������������У��������ܶ����ڷ����С�	  
	 * */
	public static int max(int x,int y){
		return x>y?x:y;
	}
	public static void main(String[] args) {
		/**
		 * �����ĵ��ã�ʹ�÷������Ͳ����б���÷���	��max(3,4)
		 * */
		//max(3);	//�������û��max(int)�ķ���
		max(3,4);	//�����˷���max(int x,int y),����ֵ������		
		int n = max(10,3);	//�����˷���ֵ
		System.out.println(n);//10
		int x = 5;int y = 6;
		int z = max(x,y);
		System.out.println(z);
		//����ϵͳAPI�ṩ�ķ���
		double a = Math.sqrt(2);	//����2�Ŀ�ƽ������
		int b =Math.max(4, 5);
		double c = Math.sin(2);
		System.out.print(a+" "+b+" "+c+" ");

	}

}
