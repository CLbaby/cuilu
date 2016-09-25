package day04;
import java.util.Scanner;
public class Demo9 {

	public static void main(String[] args) {
		char c;
		String str;
		Scanner console = new Scanner(System.in);
		//String str = console.nextLine();
		
		do{
			System.out.print("Please imput data:");
			str = console.nextLine();
			c =str.charAt(0);
//			System.out.println(str);
		}while(c>'9'||c<'0');
		System.out.println(str);
		int n = Integer.parseInt(str);	//½«×Ö·û´®×ª»»Îªint
		System.out.println(n);

	}

}
