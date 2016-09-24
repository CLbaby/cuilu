package day03;
/**
 * 自增（减）运算
 * ++ --
 * */
public class Demo3 {

	public static void main(String[] args) {
		int a = 1;
		a++;	//	将a增加1
		++a;
		System.out.println(a);	//3
		a = 1;
		int b = a++;	//后++，先用a 然后+1
		//上述表达的运算步骤---先执行++运算，后执行赋值运算
		//1.取a的值作为(a++)的结果1
		//将a增加1 a为2	
		//执行赋值运算 将（a++）结果1 赋值给b
		System.out.println(a+" "+b);	// 2 1
		a = 1;
		a = a++;
		System.out.println(a); 	//1 a曾经是2 哈哈哈哈！
		
		a = 1;
		b = ++a;	//先++，先将a+1，然后用a
		//执行步骤：先执行++然后进行赋值运算
		//1.将a的值增加1，a为2
		//2.取a的值为（++a）的值2
		//3.赋值运算，将（++a）的值2，赋值给b 为2
		System.out.println(a+" "+b);	//2 2
				
		//运算优先级:与数学规则一致
		//++ -- 优先级高于* /
		
		int x = 5;
		int y = 6;
		y = y + --x * y++ + y;	//6+4*6+7=37 不建议使用表达式
		System.out.println(y);
	}

}
