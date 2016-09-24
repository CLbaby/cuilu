package day02;
/**变量的演示
 * 变量必须声明并且初始化以后使用
 * java是强类型语言，java的变量有明确的类型
 * */
public class Demo2 {

	public static void main(String[] args) {
		//int 表示整数类型
		//System.out.println(x);	编译错误：木有鱼丸
		int x;	//声明变量，从程序位置开始有x变量了
		//System.out.println(x);	编译错误：x没有初始化
		//还没有给x赋值
		x = 8;	//初始化就是第一次赋值
		System.out.println(x);	//x已经声明并初始化了
		//...
		//x = 3.14;	//编译错误：double类型不能赋值给整数
		double d = 3.14;	//double(双倍的)双精度小数， 声明同时初始化
		
		System.out.println(d);
	}
}
