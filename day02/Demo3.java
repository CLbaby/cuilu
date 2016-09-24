package day02;
/**
 * 变量的作用域
 * 变量在声明的地方开始，到块结束
 * 一对{}叫块
 * java定义变量的作用域越小越好
 * */
public class Demo3 {

	public static void main(String[] args) {
		
		int x = 8;
		System.out.println(x);
		{
			int y = 9;	//块中有效
			System.out.println(x + y);
		}
		//System.out.println(y);	 编译错误：没有变量y
		System.out.println(x);
	}
}
