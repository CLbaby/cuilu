package day04;
/**
 * for语句中的三个表达式可以适当的省略
 * 
 * */
public class Demo1 {

	public static void main(String[] args) {
		//变量的作用域，越小越好！尽量在循环内部定义变量！
		
		
		//i变量作用域，在for内部有效
		for(int i = 1;i<=10;i++){
			System.out.print(i);
		}//没有i
		
		
		//i变量作用域，是main方法中有效
		int i = 1;
		for( ;i<=10;i++){
			System.out.print(i);
		}//循环结束后可以输出i i=11,循环是在不满足条件的时候结束的！
		
	}
}		
			
		
		
		
		
		
		

	
