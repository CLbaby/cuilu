package day02;
/**
 * ��ѧ����
 * ������ͬ�Ĳ������㣬����������ͬ��ֵ
 * С��32λ����Ϊint����
 * ע�⣺������ �������������--��������
 * */
public class Demo14 {

	public static void main(String[] args) {
		int x = 1;
		long y = 2L;
		long z= x+y;	//��x int����תΪlong
		//int z= x+y;	//�������x+y��long����
		System.out.println(z);

		x = 2;
		int n = 1/x;	//1����2 �õ�����0
		double d = 1d/x;
		System.out.println(n);
		System.out.println(d);
		long now = System.currentTimeMillis();
		long year = now/1000/60/60/24/365+1970;
		System.out.println(year);
		double dx = now/1000d/60/60/24/365+1970;
		System.out.println(dx);
				
		//1/2+1/3+1/4+1/5=0
		/**
	 * method del(){
		 * p=l.head;
		 * if(p.value==x){
		 * 		p.del();
		 * 		p=p->next;
		 *  
		 * }
		 * */
	}

}
 