package day03;
/**循环结构 for while do-while
 * 
 * 1 执行1：i=0;
 * 2 执行2： i<10;
 * 3 执行3：控制台输出0；
 * 4 执行4：i++；
 * 5 执行2：1<10 true
 * 6 执行3：输出1
 * ...
 * */
public class Demo16 {

	public static void main(String[] args) {
		for(int i=0/*1*/;i<10;/*2*/i++/*4*/){
			System.out.print(i);/*3*/
		}
		System.out.println("bye!");
	}

} 
