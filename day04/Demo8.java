package day04;
/**
 * 查找一个范围内所有的质数
 * 质数：大于1的数，只可以被1整除和自身整除
 * 步骤：    1.判断一个数是否是质数
 * 			不能被其他数整除：反之如果能被另外一个数整除就不是质数
 * 			假设一个数是num:100
 * 			另外一个数是n: n的范围 [2，n/2]->[2,50]
 * 			如num=100,能整除的数一定在[2,50]范围内
 * 			整除：mun%n==0 整除，如果整除就不是质数
 * 		    反之，如果比较了所有的数都没有整除，这个数就是质数
 * 			int num;boolean isPrime = true;
 * 			for(int n=2;n<num/2;n++){
 * 				if(num%n==0){	//当前num不是质数
 * 					isPrime = false;
 * 					break;	//一旦发现能够整除就不再比较下一个数了
 * 				} 
 * 			}
 * 			if(isPrime){
 * 				system.out.println(num+"是质数")
			}
 * 
 * 
 * 		2.找出一个范围内所有的质数
 * */
public class Demo8 {

	public static void main(String[] args) {
		//如果发现num不是质数，就检查下一个num
		
		next:for(int num=2;num<100;num++){	//带标号的for循环
			for(int n=2;n<n/2;n++){
				if(num%n==0){	//如果整除，num不是质数
					continue next;		//回到外层循环的下次，检查下一个num	 ->即跳过输出语句惹
					//打断了当前循环，继续执行next标号对应的外层循环
				}
			}
			System.out.print(num+" ");
		}
		
	}	
}
//		for(int num=2;num<100;num++){
//			boolean isPrime=true;	//Prime number：质数
//			for(int n=2;n<num/2;n++){
//				if(num%n==0){
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime){
//				System.out.print(num+" ");
//			}
//		}
//	}

