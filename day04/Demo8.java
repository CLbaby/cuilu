package day04;
/**
 * ����һ����Χ�����е�����
 * ����������1������ֻ���Ա�1��������������
 * ���裺    1.�ж�һ�����Ƿ�������
 * 			���ܱ���������������֮����ܱ�����һ���������Ͳ�������
 * 			����һ������num:100
 * 			����һ������n: n�ķ�Χ [2��n/2]->[2,50]
 * 			��num=100,����������һ����[2,50]��Χ��
 * 			������mun%n==0 ��������������Ͳ�������
 * 		    ��֮������Ƚ������е�����û���������������������
 * 			int num;boolean isPrime = true;
 * 			for(int n=2;n<num/2;n++){
 * 				if(num%n==0){	//��ǰnum��������
 * 					isPrime = false;
 * 					break;	//һ�������ܹ������Ͳ��ٱȽ���һ������
 * 				} 
 * 			}
 * 			if(isPrime){
 * 				system.out.println(num+"������")
			}
 * 
 * 
 * 		2.�ҳ�һ����Χ�����е�����
 * */
public class Demo8 {

	public static void main(String[] args) {
		//�������num�����������ͼ����һ��num
		
		next:for(int num=2;num<100;num++){	//����ŵ�forѭ��
			for(int n=2;n<n/2;n++){
				if(num%n==0){	//���������num��������
					continue next;		//�ص����ѭ�����´Σ������һ��num	 ->��������������
					//����˵�ǰѭ��������ִ��next��Ŷ�Ӧ�����ѭ��
				}
			}
			System.out.print(num+" ");
		}
		
	}	
}
//		for(int num=2;num<100;num++){
//			boolean isPrime=true;	//Prime number������
//			for(int n=2;n<num/2;n++){
//				if(num%n==0){
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime){
//				System.out.print(num+" ");
//			}
//		}
//	}

