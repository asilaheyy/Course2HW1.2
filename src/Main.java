public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car();
        Car audiA8 = new Car("Audi","A8 50L TDI quattro", 2020,"Germany","Black", 3.0d);
        Car bMWZ8 = new Car("BMW", "Z8", 2021, "Germany", "Black", 3.0d);
        Car kiaSportage = new Car("Kia","Sportage 4", 2018,"South Korea", "Red",2.4d);
        Car hyundaiAvante = new Car(null, "",2016,"South Korea", "", 0);


        ladaGranta.infoAboutCar();
        audiA8.infoAboutCar();
        bMWZ8.infoAboutCar();
        kiaSportage.infoAboutCar();
        hyundaiAvante.infoAboutCar();
    }
}