package day04;
import java.util.Scanner;
/**
 * -----------------改进版命令解释器--------------------
 * 注意：比较字符串之间是否相等必须使用equals方法！不能使用==
 * "1".equals(command)比 command.equals("1")要好，后者可能会出现空指针异常！
 * 
 * */
public class Demo4 {

	public static void main(String[] args) {		
		Scanner console = new Scanner(System.in);	//创建控制台接口的对象		
		while(true){	//死循环   等价于 for(;;)
			System.out.println("\n选择功能：\n1.查看全部 \n2.删除 " + 
					"\n3.添加  \n0.退出 \n请选择：");			
			String command = console.nextLine();	//"0"  "HI" IO阻塞状态
			//比较字符串之间大小必须用equals不能用==
			if("1".equals(command)) {	//
				System.out.println("view");
			}else if("2".equals(command)){
				System.out.println("delete");
			}else if("3".equals(command)){
				System.out.println("add");
			}else if("0".equals(command)){
				System.out.println("exit");
				break;	//	break：打断！结束当前循环
			}else{
				System.out.println("error!");
			} 
		}			
	} 
}
