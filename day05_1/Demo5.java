package day05_1;

import java.util.Random;

/**
 * ��Ʊ˫ɫ�����⣺
 * 1�����������n,n�ķ�Χ��0<=n<=33,����n=0
 * 2)���n��Ӧ�����ʹ�ñ�� used[n]
 * 3)���ʹ�ù���used[n]��ֵ��true���ͷ��أ�1��
 * 4�����û��ʹ�ù�����ȡ����pool[n],�͵�balls[i++]
 *   balls[i++]=pool[n]
 *   n��Ӧ��ʹ�ñ��Ϊtrue����ʾʹ�ù���
 * 5�����balls���������������˾ͽ���
 * 		boolean full = i==balls.length
 * 6)���أ�1��
 * */
public class Demo5 {

	public static void main(String[] args) {
		int n=0;
		int[] pool = new int[33];
		int[] balls = new int[6];
//		for(int i =0;i<33;i++){
//			int a = 1;
//			pool[i] = a;
//			a++;
//		}
		int i = 0;
		boolean[] used =new boolean[pool.length];	//	��ʼֵΪfalse
		//�����������Random random = new Random();
		//int n = random.nextInt(pool.length);	����0~33�������
		while(true){
			n =(int) (pool.length*Math.random());	//����0~33�������
			pool[n] = n;
//			if(used[n]){
//				continue;
//			}
			if(used[n]==false){
				balls[i++]=pool[n];
				used[n] = true;
				
			} 
			if(i==balls.length){
				break;
			}
						
		}
//		System.out.print(balls[0]+" ");
//		System.out.print(balls[1]+" ");
//		System.out.print(balls[2]+" ");
//		System.out.print(balls[3]+" ");
//		System.out.print(balls[4]+" ");
//		System.out.print(balls[5]+" ");
		for(int j=0;j<balls.length;j++){
			System.out.print(balls[j]+" ");
		}
	}

}
