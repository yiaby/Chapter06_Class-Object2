package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory =  CarFactory.getInstance();  //싱글톤 패턴
		Car mySonata = factory.creatCar();		 //메서드에서 car생성
		Car yourSonata = factory.creatCar();
		System.out.println(mySonata.getCarNum());	 //10001출력
		System.out.println(yourSonata.getCarNum());//10002출력
		
	}

}
