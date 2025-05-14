interface vintageHaver {
    int getYear();
}

interface valueHaver {
    double getValue();
}

class Asset implements vintageHaver, valueHaver {
    private double value = 0;
    private int year = 1970;

    Asset(int year, double value) {
        this.year = year;
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public int getYear() {
        return this.year;
    }
}

class House extends Asset {
    double sqft;

    House(int year, double value) {
        super(year, value);
    }
}

class Car extends Asset {
    int mileage;

    Car(int year, double value) {
        super(year, value);
    }
}

class Jewelry extends Asset {
    double karat = 0;

    Jewelry(int year, double value) {
        super(year, value);
    }
}

class Furniture extends Asset {
    String material;

    Furniture(int year, double value) {
        super(year, value);
    }
}


public class Main {
    public static void main(String[] args) {
        Asset[] assetList = {
                new House(1979, 250000),
                new Car(1999, 2000),
                new Jewelry(2020, 2000),
                new Furniture(1890, 9000)
        };

        double total = 0;
        Asset oldest = null;

        for (Asset item : assetList) {
            total += item.getValue();
            if (oldest == null || item.getYear() > oldest.getYear()) {
                oldest = item;
            }
        }

        System.out.println(total);
        System.out.println(oldest.getValue());
    }
}
