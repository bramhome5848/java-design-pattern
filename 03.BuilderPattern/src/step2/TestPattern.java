package step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

    public static void main(String[] args) {

        Person p1 = Person.builder()    //여기까지 PersonBuilder 이후 함수들 연달아 수행
                .firstName("FirstName") //함수 수행에도 계속 PersonBuilder 리턴됨
                .lastName("LastName")
                .addressOne("Address1")
                .addressTwo("Address2")
                .birthDate(LocalDate.of(2020, Month.JULY, 13))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();

        System.out.println("p1.getFirstName() = " + p1.getFirstName());
        //다양한 생성자를 만들 필요가 없어짐
        //Spring @Builder로 편하게 이용
    }
}
