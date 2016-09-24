package day02;
/**
 * 整数的演示
 * 任何数据在内存中都是二进制的
 * 内存中没有10进制 16进制 
 * byte的范围  -128 ~ 127
 * short的范围 -32768 ~ 32767
 * int 的范围 -21亿    ~ 21亿		-2^31 ~ 2^31-1
 * */
public class Demo5 {

	public static void main(String[] args) {
		byte b;
		b = -128;
		//b = -129;	//编译错误：越界	
		System.out.println(b);
		//short s = 32768;	//编译错误：越界
		short s = 32767;
		//将直接量5赋值给变量i
		int i = 5;	//5直接量（字面量）直接写出的常数
		//规定 ：凡是整数直接量都是int类型数据
		//以0x开头的直接量是16进制数据
		i = 0xf;
		i = 0x10;
		//i = 100010100000;	//编译错误：超过整数范围
	}
}
