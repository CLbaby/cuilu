package day04;
/**
 * break，结束当前循环
 
 * */
public class Demo6 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==5) break;	//提前结束循环
			System.out.print(i);
		}	//01234
	}

}
