public class Boat extends Vehicle {

    public Boat(String Brand, int kilometers) {
        super(Brand, kilometers);
    }

    public String doStuff() {

        return "Je suis " + getBrand() + " et je fais blou blou !";
    }
}
