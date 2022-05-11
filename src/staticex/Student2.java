package staticex;

public class Student2 {
	private static int serialNum = 1000; //private변수로 변경
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public static int getSerialNum() {
		int i = 10; //static메서드안에서는 지역변수는 쓸수있음
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
