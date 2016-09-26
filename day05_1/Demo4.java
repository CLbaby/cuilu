package day05_1;
/**
 * 数组的迭代问题
 * 迭代：遍历，就是将数组元素逐一处理一遍的方法
 * */
public class Demo4 {

	public static void main(String[] args) {
		int[] ary = new int[]{1,1,2,3,5,8,13,21,34,55};	//length=8
		int sum = 0;
		for(int i=0;i<ary.length;i++){	//使用ary.length 来适应数组不断增加的元素
			sum = sum+ary[i];			
		}
		System.out.print(sum);
	}

}
