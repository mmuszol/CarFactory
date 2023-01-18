public class Car {
    String model;
    String brand;
    String color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo(){
        System.out.println(this.brand +" "+this.model + " " + this.color);
    }
}
