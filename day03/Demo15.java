package day03;
import java.util.Scanner;
/**
 * ��ѡ�����¹��ܣ�
 * 1.��ʾȫ���û��б�
 * 2.������û�
 * 3.�޸��û�������
 * 4.ɾ���Ѿ����ڵ��û�
 * 0.�뿪ϵͳ
 * ��ѡ��0,1,2,3,4,��
 * */
public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ѡ�����¹��ܣ�");
		System.out.println("\t1 ��ʾȫ���û��б�");	//�Ʊ��
		System.out.println("\t2 ������û�");
		System.out.println("\t3�޸��û�������");
		System.out.println("\t4 ɾ���Ѿ����ڵ��û�");
		System.out.println("\t0 �뿪ϵͳ");
		System.out.print("��ѡ��(0,1,2,3,4,):");
		Scanner console = new Scanner (System.in);
		int command = console.nextInt();
		
		switch(command){
			case 1:
				System.out.println("��ʾȫ���û��б�");
				break;
			case 2:
				System.out.println("������û�");
				break;
			case 3:
				System.out.println("�޸��û�������");
				break;
			case 4:
				System.out.println("ɾ���Ѿ����ڵ��û�");
				break;
			case 0:
				System.out.println("�뿪ϵͳ");
				break;
			default:System.out.println("ָ�����");
				
				
				
		}
		

	}

}
