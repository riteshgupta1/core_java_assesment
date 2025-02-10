public class Question1{
    public static void checkVovel(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel.");
                break;
            default:
                if (Character.isLetter(letter)) {
                    System.out.println(letter + " is a consonant.");
                } else {
                    System.out.println(letter + " is not a valid letter.");
                }
                break;
        }
    }
    
    public static void main(String[] args) {


        checkVovel('A'); 
        checkVovel('b');
        checkVovel('1');
    }
}
