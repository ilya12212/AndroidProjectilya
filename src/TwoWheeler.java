public class TwoWheeler extends Transport{
    String color;
    double radius;
    public TwoWheeler(int speed, int price, String brand, double weight, String color, double radius) {
        super(speed, price, brand, weight);
        super.acceleration();
        super.TypeOfFuel();
        this.color = color;
        this.radius = radius;
    }

    public  void occupiedPlace(){
        System.out.println("4m ^ 5m");
    }

    @Override
    public String toString() {
        return
                "\nSpeed = " + this.speed + "\nPrice = " + this.price + "\nBrand = " + this.brand + "\nWeight = "
                        + this.weight + "\nColor"  + this.color + "\nRadius" +  this.radius;
    }
}
