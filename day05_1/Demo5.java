package day05_1;

import java.util.Random;

/**
 * 彩票双色球问题：
 * 1）生成随机数n,n的范围是0<=n<=33,假设n=0
 * 2)检查n对应的球的使用标记 used[n]
 * 3)如果使用过，used[n]的值是true，就返回（1）
 * 4）如果没有使用过，就取出球pool[n],送到balls[i++]
 *   balls[i++]=pool[n]
 *   n对应的使用标记为true，表示使用过了
 * 5）检查balls球的数量，如果满了就结束
 * 		boolean full = i==balls.length
 * 6)返回（1）
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
		boolean[] used =new boolean[pool.length];	//	初始值为false
		//生成随机数：Random random = new Random();
		//int n = random.nextInt(pool.length);	生成0~33的随机数
		while(true){
			n =(int) (pool.length*Math.random());	//生成0~33的随机数
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
