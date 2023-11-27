package fc.java.part3.ch01;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야 되는 경우를 생각해보자.
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = sc.nextInt();

        System.out.print("자동차 이름 : ");
        String carName = sc.nextLine();
        sc.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = sc.nextInt();
        sc.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = sc.nextLine();
        sc.nextLine();

        System.out.print("자동차 연식 : ");
        int carYear = sc.nextInt();
        sc.nextLine();

        System.out.print("자동차 타입 : "); // G(휘발유), D(경유)
        String carType = sc.nextLine();

        // System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요하다. (DTO, VO)
        // 클래스로 CarDTO, CarVO 모델을 설계
//        carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);

        CarDTO car = new CarDTO(); // 데이터를 묶어주는 작업
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);

    } // main_

    // Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하시오.
    public static void carInfoPrint(CarDTO car) {

      System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);

    } // carInfoPrint_
}
