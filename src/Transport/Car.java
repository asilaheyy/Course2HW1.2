package Transport;

import java.time.LocalDate;

public class Car {

    private String brand;

    private String model;

    private float engineVolume;
    private String colour;
    private final int productionYear;
    private final String productionCountry;
    private String gearBox;
    private final String coachworkType;
    private String registerNumber;
    private final int seats;
    private boolean winterTires;
    private final Insurance insurance;
    private final Key key;

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String colour,
               float engineVolume,
               String registerNumber,
               String gearBox,
               String coachworkType,
               int seats,
               boolean winterTires,
               Insurance insurance,
               Key key) {
        this.brand = ValidationUtils.validOrDeafult(brand, "default");
        this.model = ValidationUtils.validOrDeafult(model, "default");
        this.productionCountry = ValidationUtils.validOrDeafult(productionCountry, "default");
        this.productionYear = productionYear >= 0 ? productionYear : 2000;
        this.seats = Math.max(seats, 1);
        this.coachworkType = ValidationUtils.validOrDeafult(coachworkType, "default");
        this.insurance = insurance;
        this.key = key;
        setColour(colour);
        setEngineVolume(engineVolume);
        setRegisterNumber(registerNumber);
        isRegNumValid();
        setGearBox(gearBox);
        setWinterTires(winterTires);
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public String toString() {
        return "Марка " + brand
                + ", модель " + model
                + ", год выпуска " + productionYear
                + ", страна сборки " + productionCountry
                + ", цвет " + colour
                + ", объем двигателя - " + engineVolume + " л."
                + "Шины: " + winterTires
                + " Регистрационный номер: " + registerNumber
                + " Коробка передач: " + gearBox
                + " Тип кузова:" + coachworkType
                + " Сидений:" + seats;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }


    public int getProductionYear() {
        return productionYear;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = ValidationUtils.validOrDeafult(colour, "White");
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume >= 0 ? engineVolume : 1.5f;
    }


    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDeafult(gearBox, "deafult");
    }


    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = ValidationUtils.validOrDeafult(registerNumber, "default");
    }


    public String getCoachworkType() {
        return coachworkType;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }

    public boolean isRegNumValid() {
        if (this.registerNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.registerNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "ABCDEFGHIJK";
        return allowedSymbol.contains("" + symbol);
    }

    public static class Insurance {

        private final LocalDate validUntil;

        private final float cost;

        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDeafult(number, "0");
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

}


