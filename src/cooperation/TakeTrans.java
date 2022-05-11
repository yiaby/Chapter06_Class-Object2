package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student student1 = new Student("james", 5000);
		Student student2 = new Student("Tomas", 10000);
		Student student3 = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		student1.takeBus(bus100);
		student1.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		student2.takeSubway(subwayGreen);
		student2.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1 = new Taxi("kakao");
		student3.takeTaxi(taxi1);
		student3.showInfo();
		taxi1.showInfo();
	}

}
