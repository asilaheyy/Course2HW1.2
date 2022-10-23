import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car audiA8 = new Car("Audi",
                "A8 50L TDI quattro",
                2020,
                "Germany",
                "Black",
                3.0f,
                "A999BB00",
                "Automatic",
                "A",
                5,
                false,
                new Car.Insurance(LocalDate.now().plusMonths(0), 1000.0f, "123456789"),
                new Car.Key(true, true));

        System.out.println(audiA8);
        if (!audiA8.getInsurance().isInsuranceValid()) {
            System.out.println("Страховка просрочена.");
            if (audiA8.isRegNumValid() == false) {
                System.out.println("Неправильный формат регистационного номера. Введите номер в формате х000хх000");
            }
            if (audiA8.isWinterTires() == false) {
                System.out.println("Смените шины на сезонные.");
            }
        }

    }
}