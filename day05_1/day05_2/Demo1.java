package day05_2;
/**
 * 方法的定义
 * 1）方法在类中（类体中）定义
 */
public class Demo1 {
	/** 计算x,y的最大值
	 * 方法名：与功能命名一致，一般使用动词命名！
	 * 一般使用小写字母开头，从第二个单词开始，多个单词首字母大写
	 * saveOrder()
	 * 返回值：方法必须定义返回值，如果无返回值定义void
	 * 如果定义了返回值，在方法中必须使用return语句返回数据
	 * 如上是方法的声明（定义），方法定义在类体中！方法不能定义在方法中。	  
	 * */
	public static int max(int x,int y){
		return x>y?x:y;
	}
	public static void main(String[] args) {
		/**
		 * 方法的调用：使用方法名和参数列表调用方法	如max(3,4)
		 * */
		//max(3);	//编译错误：没有max(int)的方法
		max(3,4);	//调用了方法max(int x,int y),返回值被丢弃		
		int z = max(10,3);	//接受了返回值
		System.out.print(z);//10

	}

}
