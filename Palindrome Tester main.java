
public class Main {

    public static void main(String[] args) {
        String[] phrases = {"Palindrome", "Civic", "Radar", "Level", "Eva, can I stab bats in a cave?", "A man, a plan, a canal, Panama", "Mr. Owl ate my metal worm", "Never odd or even", "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod."};
        for (int i = 0; i < phrases.length; i++) {
            boolean test = palTester(phrases[i]);
            if (test==true) System.out.printf("\n\"%s\" is a palindrome.", phrases[i]);
            else System.out.printf("\n\"%s\" is not a palindrome.", phrases[i]);
            System.out.println(" ");
        }
    }
    public static boolean palTester(String pal) {
        pal = removal(pal);
        String lap = "";
        int len = pal.length() - 1;
        for (int i = 0; i < pal.length(); i++) {
            lap += pal.charAt(len - i);
        }
        return pal.equalsIgnoreCase(lap);
    }
    public static String removal(String pal) {
        String newPal = "";
        for (int i = 0; i < pal.length(); i++) {
            if ((pal.charAt(i) == ' ') || (pal.charAt(i) == '.') ||(pal.charAt(i) == ',') || (pal.charAt(i) == '?') || (pal.charAt(i) == '!') || (pal.charAt(i) == ':') || (pal.charAt(i) == ';')) {
            }
            else newPal += pal.charAt(i);
        }
        return newPal;
    }
}
