public class Deciferer {
    public static String decoder (String message) {

        int length = message.length();
        int keyNumber =  length/2;
        int endIndex =  keyNumber + 5;
        String subChain = message.substring(5, endIndex );
        String correct = subChain.replace("@#?"," ");
        StringBuilder sb=new StringBuilder(correct);
        sb.reverse();
        return sb.toString();
    }

    public static void main (String[] args) {

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(decoder(message1)+" "+decoder(message2)+" "+decoder(message3)) ;

    }
}