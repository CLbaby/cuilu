package day02;
/**
 * 变量不能重复声明（声明=定义）
 * 在同一个作用域中不能重复声明变量
 * */
public class Demo4 {

	public static void main(String[] args) {
		int age = 12;
		System.out.println(age);
		//int age = 15;	//编译错误：变量age重复声明
		age = 15;	//变量的赋值
		{
			//int age = 18;	//编译错误变量age重复声明
			int rank = 12;
			System.out.println(rank);
		}
		int rank = 18;	//正常声明 
		System.out.println(rank);
	}
}
