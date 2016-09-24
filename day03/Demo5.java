package day03;
/**
 * 短路逻辑运算 && ||
 * */
public class Demo5 {

	public static void main(String[] args) {
		int age = 65;
		char sex = '男';
		//如果sex=='女'的计算结果是true，则可以确定整个逻辑&&运算的结果，那么 age++=60 运算就不再执行了
		if(sex =='女' && age++>60){	//60岁以上的老太太
			System.out.println("welcome!");			
		}else{
			System.out.println("你根本不是司机！");	
		}
		System.out.println(age);	//65表示（++age>60）没有执行
		//是短路逻辑
		
		age = 10;
		sex = '女';
		if(sex=='女'|| ++age>60 ){
			System.out.println("欢迎乘车!");	
		}
		System.out.print(age);	//60
	}

}
