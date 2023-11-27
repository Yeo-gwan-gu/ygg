package fc.java.model;

public class CarUtility {
    // 프린트
    public void carPrint(CarDTO car) { // import 시 클래스 풀네임을 입력 하지 않아도 된다.
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);

    }
}
