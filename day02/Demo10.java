package day02;
/**
 * �ַ����� char
 * 16λ�޷������� ��Χ��0 ~ 65535 û�и���
 * ���԰�����������
 * ��ֵ��unicode����ֵ
 * 
 * */
public class Demo10 {

	public static void main(String[] args) {
		char c = 'A';	//'A'�ַ�ֱ����		
		//(int) ǿ������ת��
		System.out.println((int)c);	//65
		System.out.println((int)'B');
		System.out.println((int)'C');
		System.out.println((int)'0');	//48
		System.out.println((int)'��');	//20013
		System.out.println((int)'��');
		System.out.println((int)'�');	
		char ch = '\'';	//��ʾһ���������ַ�
		System.out.println(ch);	//�������ַ�
		System.out.println((int)ch);	//�����ŵı���
		//  \n������  \r���س�  \t��tab \"��˫����    \\����ʾ\
		ch = '\u4e2d';
		System.out.println((int)ch);	//��
		ch = 'A'+1;		//�ַ���һ���������Բ�������
		System.out.println(ch);	//B
		System.out.println(Integer.toHexString('��'));	//��ʾ��һ���ַ���16���Ʊ���
		
		//ch = 65536;		//������󣬲��ܳ���Χ��ֵ
		//���������ַ������ֲ�����ʾ
		ch = 65535;
		System.out.println(ch);		//�ڱ���ƽ̨û�ж�Ӧ����
		ch = '\t';	//�����ַ�����ʾû��Ч��
		//���������ַ���������ʾ��ֻ�б����ַ���֧�ֵ��ַ�������ʾ������20000+��
		
		
		
	}
}
