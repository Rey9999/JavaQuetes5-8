public class Car extends Vehicle {

    public Car(String Brand, int kilometers) {
        super(Brand, kilometers);
    }
    public String doStuff() {

        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }

}
