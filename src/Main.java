public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
        System.out.println("Car 1 color is: " +car1.getColor());

        Car car2 = carFactory.buildCar();
        car2.printInfo();
        System.out.println("car 2 color is " + car2.getColor());
    }
}
