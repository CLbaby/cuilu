package day05_1;
/**
 * 访问数组元素
 * */
public class Demo3 {

	public static void main(String[] args) {
		int[] ary1 = new int[]{3,4,5};
		//数组的长度属性length
		System.out.println(ary1.length);//3
		//数组的下标范围：0,1,2   最后一个元素的位置是length-1
		//超过数组下标范围访问会出现异常。
		System.out.println(ary1[0]);//3
		System.out.println(ary1[1]);//4
		System.out.println(ary1[2]);//5
		System.out.println(ary1[ary1.length-1]);//5
		//System.out.println(ary1[3]);//运行异常，下标越界 
		//运行结果是：A编译错误		B运行异常		C 3		D 0			（B）
		
		ary1[0] = 8;	//修改数组元素
		ary1[1]++;
		System.out.println(ary1[0]);//8	//读取数组元素
		System.out.println(ary1[1]);//5
		System.out.println(ary1[2]);//5
		
	}

}
