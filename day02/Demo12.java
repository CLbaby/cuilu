package day02;
import java.util.Random;
/**
 * 随机生成字符
 * 生成从'A' ~ 'Z'范围的某个字符----------验证码！
 * 1.字符是一个数，所以就相当于生成65~90的数
 *  65~90 = 65+（0~25） = 65+[0,26)
 *  
 *  提示：字符是一个整数，可以进行加减运算
 *  提示：java中所有API方法的范围参数都是包含开始，不包含结束
 * */
public class Demo12 {
	public static void main(String[] args){
		Random random = new Random();
		int n = random.nextInt(26);		//在java中所有的
		//生成从[0,26）范围内的随机数，不包括26
		char ch = (char)('A'+n);
		//ch = (char)('A'+random.nextInt(26));
		System.out.println(ch);	//'A'~'Z'
	}
}
