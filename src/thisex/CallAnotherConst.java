package thisex;

class Person1{
	String name;
	int age;
	
	Person1(){
		this("이름 없음", 1); //this를 이용해 Person(String,int)생성자 호출
	}
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
