package fc.java.part3.ch01;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하시오.
        int carSn = 1110;
        String carName = "BMW828i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2023;
        String carType = "G";

        // 데이터를 하나로 묶는다(이동)
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

//        carPrint(car); // 호출
        CarUtility carUtil = new CarUtility(); // 객체 생성(클래스 사용)
        carUtil.carPrint(car);
    }
}
