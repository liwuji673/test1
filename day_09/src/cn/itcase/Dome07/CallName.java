package cn.itcase.Dome07;

import java.util.ArrayList;
import java.util.Random;



/*���������
 * 1.�������ϴ洢Studen��ʵ��
 * 2.����ѧ����Ϣ
 * 3.�������������Ϊ����ȥ�����в���Ԫ��
 * */
public class CallName {
public static void main(String[] args) {
	
	
	
	
//	����arraylist���ϴ洢Studentʵ��
	ArrayList<Student> array = new ArrayList<Student>();
	addStudent(array);
	printStudent(array);
	randomStudent(array);
}

//���巽��������ѧ����Ϣ����������
private static void printStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		for(int i = 0;i < array.size();i++){
			Student ss = array.get(i);
			
		System.out.println(ss.getName()+"..."+ss.getAge());
		}
}
//���巽��������Student���󲢴��뼯��s
private static void addStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
//	����Stuent����
	Student s1 =new Student();
	s1.setName("����1");
	s1.setAge(15);
	
	Student s2 =new Student();
	s2.setName("����2");
	s2.setAge(152);
	
	Student s3 =new Student();
	s3.setName("����3");
	s3.setAge(153);
	
	Student s4 =new Student();
	s4.setName("����4");
	s4.setAge(154);
	
	Student s5 =new Student();
	s5.setName("����5");
	s5.setAge(155);
	array.add(s1);
	array.add(s2);
	array.add(s3);
	array.add(s4);
	array.add(s5);
}

//���巽���������һ��������Ϊ��������Ԫ��
private static void randomStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
	Random r = new Random();
	int index= r.nextInt(array.size());
	Student s = array.get(index);
	System.out.println(s.getName());
}


}