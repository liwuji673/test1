package cn.itcase.Dome04;

public class person {
	//�˵�����
	String name;
	//�˵�����
	private int age;
	//�������������˵�����
	public void  setAge(int a){
		if(a<0||a>200){
			System.out.println("�����������������");
		}else{
			age=a;
		}
		
}
	//���巽������������˵���Լ�������������
	public void Speak(){
	
		System.out.println("�ҵ�������"+name+        "      ���Ѿ�"+age+"����");
	}
//	���巽�����Ա���ageȡֵ
	public int getAge(){
		return age;
	}

}
