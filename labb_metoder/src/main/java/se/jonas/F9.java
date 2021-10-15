package se.jonas;

public class F9 {

    public void run() {

        String str = "Tjena hur är läget";
        System.out.println(rÖvarsprÅket(str));

    }

    public static String rÖvarsprÅket(String s) {
        String översättning = "";
        for (int i = 0; i < s.length(); i++) {
            char text = s.charAt(i);
            if (bokstav(text)) {
                översättning = översättning + text;
            } else {
                översättning = översättning + text;
                översättning = översättning + "o";
                översättning = översättning + text;
            }
        }
        return översättning;
    }

    public static boolean bokstav(char text) {
        switch (text) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'å':
            case 'ä':
            case 'ö':
            case ' ':
                return true;
            default:
                return false;
        }
    }
    
}
