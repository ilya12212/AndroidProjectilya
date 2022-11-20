public class Transport {
    int speed;
    int price;
    String brand;
    double weight;

    public Transport(int speed, int price, String brand, double weight) {
        this.speed = speed;
        this.price = price;
        this.brand = brand;
        this.weight = weight;
    }


    public void acceleration() {
        System.out.println("I accelerate in 25 seconds");
    }

    public void TypeOfFuel() {
        System.out.println("I HAVE DIESEL FUEL");
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "\nSpeed = " + this.speed + "\nPrice = " + this.price + "\nBrand = " + this.brand + "\nWeight = " + this.weight;
    }
}
