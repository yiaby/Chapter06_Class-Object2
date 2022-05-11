package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID + " 카드번호:" + studentLee.studentCard);
		
		Student3 studentson = new Student3();
		studentson.setStudentName("손수정");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentson.studentName + " 학번: " + studentson.studentID + " 카드번호 : " + studentson.studentCard);
	}

}
