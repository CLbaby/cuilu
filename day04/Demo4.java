package day04;
import java.util.Scanner;
/**
 * -----------------�Ľ������������--------------------
 * ע�⣺�Ƚ��ַ���֮���Ƿ���ȱ���ʹ��equals����������ʹ��==
 * "1".equals(command)�� command.equals("1")Ҫ�ã����߿��ܻ���ֿ�ָ���쳣��
 * 
 * */
public class Demo4 {

	public static void main(String[] args) {		
		Scanner console = new Scanner(System.in);	//��������̨�ӿڵĶ���		
		while(true){	//��ѭ��   �ȼ��� for(;;)
			System.out.println("\nѡ���ܣ�\n1.�鿴ȫ�� \n2.ɾ�� " + 
					"\n3.���  \n0.�˳� \n��ѡ��");			
			String command = console.nextLine();	//"0"  "HI" IO����״̬
			//�Ƚ��ַ���֮���С������equals������==
			if("1".equals(command)) {	//
				System.out.println("view");
			}else if("2".equals(command)){
				System.out.println("delete");
			}else if("3".equals(command)){
				System.out.println("add");
			}else if("0".equals(command)){
				System.out.println("exit");
				break;	//	break����ϣ�������ǰѭ��
			}else{
				System.out.println("error!");
			} 
		}			
	} 
}
