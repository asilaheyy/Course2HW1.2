public class Car {
    String brand;
    String model;
    double engineVolume;
    String colour;
    int productionYear;
    String productionCountry;

     Car(String brand, String model, int productionYear, String productionCountry, String colour, double engineVolume) {
         if (brand == null || brand == "") {
             this.brand = "default";
         } else {
             this.brand = brand;
         }
         if (model == null || model == "") {
             this.model = "default";
         } else {
             this.model = model;
         }
         if (productionCountry == null || productionCountry == "") {
             this.productionCountry = "default";
         } else {
             this.productionCountry = productionCountry;
         }
         if (productionYear <= 0) {
             this.productionYear = 2000;
         } else {
             this.productionYear = productionYear;
         }
         if (colour == null || colour == "") {
             this.colour = "White";
         } else {
             this.colour = colour;
         }
         if (engineVolume <= 0) {
             this.engineVolume = 1.5d;
         } else {
             this.engineVolume = engineVolume;
         }
     }

    public void infoAboutCar() {
        System.out.println("Марка " + brand + ", модель " + model + ", год выпуска " + productionYear + ", страна сборки " + productionCountry + ", цвет " + colour + ", объем двигателя - " + engineVolume + " л.");
    }
}
