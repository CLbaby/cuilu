package day03;
/**
 * ��·�߼����� && ||
 * */
public class Demo5 {

	public static void main(String[] args) {
		int age = 65;
		char sex = '��';
		//���sex=='Ů'�ļ�������true�������ȷ�������߼�&&����Ľ������ô age++=60 ����Ͳ���ִ����
		if(sex =='Ů' && age++>60){	//60�����ϵ���̫̫
			System.out.println("welcome!");			
		}else{
			System.out.println("���������˾����");	
		}
		System.out.println(age);	//65��ʾ��++age>60��û��ִ��
		//�Ƕ�·�߼�
		
		age = 10;
		sex = 'Ů';
		if(sex=='Ů'|| ++age>60 ){
			System.out.println("��ӭ�˳�!");	
		}
		System.out.print(age);	//60
	}

}
