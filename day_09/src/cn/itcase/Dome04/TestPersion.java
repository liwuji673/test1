package cn.itcase.Dome04;
/*����persion��Ĳ���
 * ����peisonde��ʵ��
 * �����Խ��и�ֵ
 * */
public class TestPersion {
	public static void main(String[] args) {
		//����persion��ʵ��
		person persion1 = new person();
		//�Զ����ڳ�Ա������ֵ
		persion1.name = "�ƾ�";
//		���÷�����persion˽�г�Ա��ֵ��
		persion1.setAge(-10);
//		���÷����������������������
		persion1.Speak();
		System.out.println(persion1.getAge());
		
	}

}
