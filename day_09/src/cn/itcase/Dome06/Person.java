package cn.itcase.Dome06;

public class Person {
private int age;
public void setAge(int age){
	this.age=age;
}
public int  getAge(){
	return age;
}
public boolean compare(Person p){
	return this.age==p.age;
}


}
