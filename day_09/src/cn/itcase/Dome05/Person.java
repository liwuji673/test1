package cn.itcase.Dome05;

public class Person {
	   //�˵�����
		private String name;
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
		
//		���������ȡ�˵�����
		public int getAge(){
			return age;
		}
		
//		���巽�������˵�����
		public void setName(String name){
			this.name= name;
		}
		
//		���巽����ȡ�˵�����
		public String getName(){
			return name;
		}
//      ���巽������������˵���Լ�������������
		public void Speak(){
		
			System.out.println("�ҵ�������"+name+        "      ���Ѿ�"+age+"����");
		}

}
