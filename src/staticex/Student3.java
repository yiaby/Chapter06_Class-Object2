package staticex;

public class Student3 {
	private static int serialNum = 1000;
	public int studentID;
	public int studentCard;
	public String studentName;
	public int grade;
	public String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum; 
		studentCard = studentID + 100;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	

}
