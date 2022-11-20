public class Truck extends Transport{
    double loadCapacity;
    int countTrailers;

    public Truck(int speed, int price, String brand, double weight, double loadCapacity, int countTrailers) {
        super(speed, price, brand, weight);
        super.acceleration();
        super.TypeOfFuel();
        this.loadCapacity = loadCapacity;
        this.countTrailers = countTrailers;
    }

    public void size(){
        System.out.println("I'm Huge");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getCountTrailers() {
        return countTrailers;
    }

    public void setCountTrailers(int countTrailers) {
        this.countTrailers = countTrailers;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return
                "\nSpeed = " + this.speed + "\nPrice = " + this.price + "\nBrand = " + this.brand + "\nWeight = "
                        + this.weight + "\nLoadCapacity = "  + this.loadCapacity + "\nCount = " +  this.countTrailers;
    }
}
