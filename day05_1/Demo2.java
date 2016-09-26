package day05_1;
/**
 * 数组 
 * 声明数组变量
 * 创建数组对象
 * */
public class Demo2 {

	public static void main(String[] args) {
		//声明和创建数组
		int[] ary;	//声明数组变量ary
		ary = new int[3];	//创建数组对象，简称创建数组
		//ary=数组对象：表示ary的值引用了数组对象
		//ary是引用变量，引用了一个数组对象new int[10]
		//旺财是代词，引用了一个汪星人，旺财是狗的专有代词
		int[] ary2 = ary;	//引用的赋值，赋值结果ary2和ary引用了同一个数组对象
		//邻居叫我的旺财是二狗，意思就是：二狗=旺财 结果畜生和旺财引用了同一只汪星人
		//两个变量，一个对象。
		ary[0] = 3;
		System.out.println(ary2[0]);	//3
	//数组元素的自动初始化现象：创建数组时，数组元素自动初始化，初始化为0值：0 0.0 false \u0000->编码为0的字符，是控制字符
	//
		int[] ary3 = new int[3];	//元素自动初始化为0
		System.out.println(ary3[0]);	//0
		System.out.println(ary3[1]);	//0
		System.out.println(ary3[2]);	//0
		double[] ary4 = new double[3];
		System.out.println(ary4[0]);	//0.0
		boolean[] ary5 = new boolean[3];
		System.out.println(ary5[0]);	//false
		char[] ary6 = new char[3];
		System.out.println(ary6[0]);	//控制字符\u0000显示无效果!
		System.out.println((int)ary6[0]);	//0
		
	//创建数组时候直接初始化元素
		int[] ary7 = new int[]{2,3,4};
		System.out.println(ary7[0]);	//2
	//数组的静态初始化 ：简化版初始化数组元素，只能在声明变量的时候直接赋值，不能用在赋值
		int[] ary8 ={2,3,4};
		//ary8 = {4,5,6};	//编译错误，静态初始化数组只能在初始化时赋值
		ary8 = new int[]{4,5,6};
		//{0,0,0} , new int[]{0,0,0} 和new int[3]
		//如上3种数组，是没有任何差别的~
		//根据实际业务需要，哪种方便用哪种
		//如，创建10000个元素的数组：用new int[10000];
		//如，已知有具体元素，用{2,3,4}或者new int[]{2,3,4}
				
	}

}
