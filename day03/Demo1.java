package day03;
/**
 * float和long：
 * float的精度没有long高（有效位数=尾数短）
 * float的范围大于long（指数可以很大）
 * 范围由长度决定，精度用有效位数长度决定
 * */
public class Demo1 {

	public static void main(String[] args) {
		long l = 31415926535897932L;
		System.out.println(l);
		float f = l;	//精度损失
		System.out.println(f);
		f = f*10000;
		l = (long)f;	
		System.out.println(l);	//溢出，远远超过long的范围
		
	}

}
