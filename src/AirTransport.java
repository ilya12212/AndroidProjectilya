public class AirTransport extends Transport{
    int numberOfPeople;
    double enginePower;


    public AirTransport(int speed, int price, String brand, double weight, int numberOfPeople, double enginePower) {
        super(speed, price, brand, weight);
        super.acceleration();
        super.TypeOfFuel();
        this.numberOfPeople  = numberOfPeople;
        this.enginePower = enginePower;
    }

    public void maximumHeight(){
        System.out.println("My Maximum Height = 3000km");
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return
                "\nSpeed = " + this.speed + "\nPrice = " + this.price + "\nBrand = " + this.brand + "\nWeight = " + this.weight + "\nNumber = " + numberOfPeople + "\nEnginePower" +
                enginePower;
    }


}
