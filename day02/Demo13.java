package day02;
/**
 * 布尔类型
 * 用于表示true（真）false（假）状态
 * 用来表示判断结果
 * */
public class Demo13 {

	public static void main(String[] args) {
		
		boolean isMan = true;//真的是男人
		//isMan = false;	//不是男人
		boolean used = true;	//真的是二手
		//used = false;	//全新
		if(used){	//used = true
			System.out.println("二手八折！");
		}
		if(isMan){
			System.out.println("是男生哦");
		}
		
		

	}

}
