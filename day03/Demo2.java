package day03;
/**
 * 取余数运算
 * 获取除法结果的余数
 * 1.负数的余数是负数！
 * 2.num/n n>=0 结果范围[0,n)是周期函数
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		int num = 9;
		int x = num%5;	//9/5 = 1...4
		System.out.println(x);
		
		num = 4;
		System.out.println(num%5);	// 4/5 = 0...4
		
		System.out.println(-1%5);	//-1
		System.out.println(0%5);	//0
		System.out.println(1%5);	//1
		System.out.println(2%5);	//2
		System.out.println(3%5);	//3
		System.out.println(4%5);	//4
		System.out.println(5%5);	//0
		System.out.println(6%5);	//1
		System.out.println(7%5);	//2
		System.out.println(8%5);	//3
		//用途：如周期性的换不同的图片
	
	}

}
