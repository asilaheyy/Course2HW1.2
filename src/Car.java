public class Car {
    String brand;
    String model;
    double engineVolume;
    String colour;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, int productionYear, String productionCountry, String colour, double engineVolume) {
        this.brand = brand;
        brandNull();
        this.model = model;
        modelNull();
        this.productionCountry = productionCountry;
        productionCountryNull();
        this.productionYear = productionYear;
        productionYearNull();
        this.colour = colour;
        colourNull();
        this.engineVolume = engineVolume;
        engineVolumeNull();
    }

    Car() {
        this.brand = "default";
        this.model = "default";
        this.colour = "White";
        this.productionCountry = "default";
        this.engineVolume = 1.5d;
        this.productionYear = 2000;
    }


    public void infoAboutCar() {
        System.out.println("Марка " + brand + ", модель " + model + ", год выпуска " + productionYear + ", страна сборки " + productionCountry + ", цвет " + colour + ", объем двигателя - " + engineVolume + " л.");
    }

    public void brandNull() {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public void modelNull() {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void productionCountryNull() {
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    public void productionYearNull() {
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    public void colourNull() {
        if (colour == null || colour.isEmpty()) {
            this.colour = "White";
        } else {
            this.colour = colour;
        }
    }

    public void engineVolumeNull() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5d;
        } else {
            this.engineVolume = engineVolume;
        }
    }
}
