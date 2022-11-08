public class Hangar {

    public static void main(String[] args) {
       Car Clio = new Car("Clio",450000);
       Boat Haddock = new Boat("Haddock",2000000);

        System.out.println(Clio.doStuff());
        System.out.println(Haddock.doStuff());
    }
}
