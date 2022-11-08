public class Classroom {

    public static void main(String[] args) {

        Wilder charles = new Wilder("Charles", true);
        Wilder Marion = new Wilder("Marion", false);

        System.out.println(charles.whoAmI());
        System.out.println(Marion.whoAmI());
    }
}
