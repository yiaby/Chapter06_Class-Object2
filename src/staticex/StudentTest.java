package staticex;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);//seriaNuma변수 초깃값 출력
		studentLee.serialNum++; // static 변수 값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수정");
		
		//증가된 값 출력
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
