package cn.itcase.Dome05;



public class TestPerson {
	public static void main(String[] args) {
		//����persion��ʵ��
		Person persion1 = new Person();
		
//		���÷������ö���������������
		persion1.setAge(10);
		persion1.setName("����");
//		���÷�����ȡ���������������
		persion1.getAge();
		persion1.getName();
//		���÷����������������������
		persion1.Speak();
		System.out.println(persion1.getAge());
		
	}
}
