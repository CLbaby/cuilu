package day04;
/**
 * continue
 * */
public class Demo5 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i<5) continue;	//重新开始本次循环
			System.out.print(i+" ");//5 6 7 8 9 10
		}
	}

}
