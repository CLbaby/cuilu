package day02;
/**
 * 字符类型 char
 * 16位无符号整数 范围从0 ~ 65535 没有负数
 * 可以按照整数计算
 * 数值是unicode编码值
 * 
 * */
public class Demo10 {

	public static void main(String[] args) {
		char c = 'A';	//'A'字符直接量		
		//(int) 强制类型转换
		System.out.println((int)c);	//65
		System.out.println((int)'B');
		System.out.println((int)'C');
		System.out.println((int)'0');	//48
		System.out.println((int)'中');	//20013
		System.out.println((int)'崔');
		System.out.println((int)'璐');	
		char ch = '\'';	//表示一个单引号字符
		System.out.println(ch);	//单引号字符
		System.out.println((int)ch);	//单引号的编码
		//  \n：换行  \r：回车  \t：tab \"：双引号    \\：表示\
		ch = '\u4e2d';
		System.out.println((int)ch);	//中
		ch = 'A'+1;		//字符是一个整数可以参与运算
		System.out.println(ch);	//B
		System.out.println(Integer.toHexString('国'));	//显示出一个字符的16进制编码
		
		//ch = 65536;		//编译错误，不能超范围赋值
		//超过本地字符集的字不能显示
		ch = 65535;
		System.out.println(ch);		//在本地平台没有对应的字
		ch = '\t';	//控制字符，显示没有效果
		//不是所有字符都可以显示，只有本地字符集支持的字符才能显示（中文20000+）
		
		
		
	}
}
