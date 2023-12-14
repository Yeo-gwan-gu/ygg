package fc.java.Course1.part3.ch02;

import fc.java.Course1.model.CarDTO;
import fc.java.Course1.model.CarDAO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // Q. 자동차정보를 키보드로부터 입력을 받아서 DB에 저장을 하시오. (JDBC)
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

        CarDTO car = new CarDTO(); // 데이터를 묶어주는 작업
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
