package day04;
/**
 * for循环与while循环
 * for循环可以与while循环互换使用。达到相同的目的
 * */
public class Demo2 {

	public static void main(String[] args) {
		int i = 1;
		for(;i<=10;){
			System.out.println(i++);		
		}
		System.out.println(i);	//11
		
		//-----------完全等价-----------//
		
		i = 1;
		while(i<=10){
			System.out.println(i++);	
		}
		System.out.println(i);	
		

	}

}
