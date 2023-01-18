public class CarFactory {

    CarFactory(){

    }

    public Car buildCar(){
        String colors[]= {"black","white","red"};
        int randomIndex =(int) Math.floor(Math.random()*colors.length);
        String randomColor = colors[randomIndex];

        return new Car("Ford", "Mustang",randomColor);
    }
}
