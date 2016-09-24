package day02;
/**
 * 基本数据类型转换
 * */
public class Demo11 {

	public static void main(String[] args) {
		//自动类型转换（由小到大）
		long l = 1;		//int（32） 自动转换为long类型（64），赋值给了变量l
		l = 1024L*1024*1024*4;
		int i = (int)l;		//强制类型转换
		System.out.println(i);	//溢出,反例
		l = 1000L;
		i = (int)l;
		System.out.println(i);

	}

}
