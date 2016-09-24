package day02;
/**
 * 数学运算
 * 类型相同的参与运算，返回类型相同的值
 * 小于32位数作为int计算
 * 注意：整数的 除法结果是整数--整除现象
 * */
public class Demo14 {

	public static void main(String[] args) {
		int x = 1;
		long y = 2L;
		long z= x+y;	//将x int类型转为long
		//int z= x+y;	//编译错误：x+y是long类型
		System.out.println(z);

		x = 2;
		int n = 1/x;	//1除以2 得到整数0
		double d = 1d/x;
		System.out.println(n);
		System.out.println(d);
		long now = System.currentTimeMillis();
		long year = now/1000/60/60/24/365+1970;
		System.out.println(year);
		double dx = now/1000d/60/60/24/365+1970;
		System.out.println(dx);
				
		//1/2+1/3+1/4+1/5=0
		/**
	 * method del(){
		 * p=l.head;
		 * if(p.value==x){
		 * 		p.del();
		 * 		p=p->next;
		 *  
		 * }
		 * */
	}

}
 