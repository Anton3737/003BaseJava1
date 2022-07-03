package Vehicle;

public class Vehicle {
    public int speed;
    public int price;
    public int maxHeight;
    public int years;
    public int maxPass;
    public String coordinate;


    public static void main(String[] args) {
        Car car = new Car(320, 2022,199);
        Ship ship = new Ship(400, "Kiev", 400);
        Plane plane = new Plane(3000,66,700);




        System.out.println("Car speed " + car.speed);
        System.out.println("Car years  " + car.years);
        System.out.println("Car price  " + car.price);
        System.out.println();
        System.out.println("Ship Максимум пасажирів " + ship.maxPass);
        System.out.println("Ship Порт " + ship.coordinate);
        System.out.println("Ship price " + ship.price);
        System.out.println();
        System.out.println("Plane Максимальна висота " + plane.maxHeight);
        System.out.println("Plane Максимум пасажирів " + plane.maxPass);
        System.out.println("Plane price " + plane.price);
    }

}
