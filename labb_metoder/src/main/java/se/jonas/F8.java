package se.jonas;

public class F8 {

    public void run() {
        vocal();
    }

    private void vocal() {
        char a = 'b';
        boolean bool = bokstav(a);

        System.out.println(bool);
    }

    public static boolean bokstav(char a) {
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'å':
            case 'ä':
            case 'ö':
            case ' ':
                return false;
            default:
                return true;
        }
    }    
    
}
