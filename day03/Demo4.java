package day03;
/**
 * 关系运算 逻辑运算  
 * */
public class Demo4 {

	public static void main(String[] args) {
		char c = 'A';
		boolean b = c>'D';
		System.out.println(b);	//false
		boolean b1 = c<='Z';	//true
		
		char ch = '6';// 65 >= 48 && 65 <= 57
		boolean isNumber = ch>='0' && ch <='9';
		//判断一个字符是否是数字字符（'0'~'9'）
		//判断这个字符的编码数值介于（48~57）之间
		//				  48<=N<=57
		//      		48<=N 并且   N<=57
		
		System.out.println(isNumber);
		//判断一个字符是否是大写字符
		char ch1 ='2';
		boolean isCapital = ch1>='A'&&ch1<='Z';
		System.out.println(isCapital);
		/**
		 * 小学字母：
		 * char ch2 = '3';
		 * boolean isCapital = ch>='a' && ch<='Z';
		 * System.out println(isCapital);
		 * */
	}

}
