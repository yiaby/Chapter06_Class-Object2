package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번: " + studentLee.studentID);
		
		Student1 studentson = new Student1();
		studentson.setStudentName("손수정");
		System.out.println(studentson.serialNum);
		System.out.println(studentson.studentName + "학번: " + studentson.studentID);
	}

}
