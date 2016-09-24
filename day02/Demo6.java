package day02;
/**
 * long类型数据
 * 范围：-2^63 ~ 2^63-1
 * 1970.1.1到现在所累计的毫秒数做时间
 * */
public class Demo6 {

	public static void main(String[] args) {
		//long l1 = 10000000000000;	//编译错误： 整数字面量超过int范围了
		long l1 = 10000000000000L;	//L为后缀的字面量是long类型
		long now = System.currentTimeMillis();	
		//从1970年元旦到现在（软件运行期间此时此刻）累计的毫秒数
		System.out.println(now);	//
		long year = now/1000/60/60/24/365+1970;
		System.out.println("公元"+year);
		
		long max = 0x7fffffffffffffffL;	//一个7 15个f 16进制MAX的写法
		long finalyear = max/1000/60/60/24/365+1970;	//long毫秒数能够表示的公元年份
		System.out.println("公元"+finalyear);
	}
}
