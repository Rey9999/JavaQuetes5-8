import java.lang.reflect.Constructor;

public class Wilder {

        private String firstname;
        private boolean aware;

        public Wilder ( String firstname, boolean aware) {

            this.firstname = firstname;
            this.aware = aware;


        }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

        // setters
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setAware(boolean aware) {
            this.aware = aware;

        }

// Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware"

    public String whoAmI() {

            return "Je m'appelle " + getFirstname() + (this.aware ? " je suis aware" : " je ne suis pas aware");
    }

}
