package cn.itcase.Dome03;
//�����������ͺ�������������

public class TestPerson {
	public static void main(String[] args) {
		int a=1;
		Person LL=new Person();
		cesi(a);
		System.out.println(a);
		LL.name= "����";
		ceis(LL);
		System.out.println(LL.name);
	}
	
	
//	���������������β���ı�ԭ����ֵ
	public static void cesi(int L){
		L=L+3;
	}
	
	/*�����������ͣ�ĳ���࣬���飬���ϵ�Ϊ������������
	����ʱ��ı�ԭ����ֵ����δ��ݵ���һ����ַ
	��ʹ���������ʱ��ͨ�������ַ�ҵ������������͵�λ�ö������ �޸ġ������������ջ
	���������������͵ĳ�Ա����ֵ�Ѿ����޸�*/
	public static void ceis(Person iii){
		iii.name="����";
	}

}
