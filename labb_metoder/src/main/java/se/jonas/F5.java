package se.jonas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F5 {

    public void run() {

        while (true) {

            System.out.println("Skriv lösenord");
            String pass = System.console().readLine();
            Pattern p = Pattern.compile("[^A-Za-z0-9]");
            Matcher m = p.matcher(pass);
            boolean b = m.find();

            if (b && pass.length() < 8) {
                System.out.println("ogiltigt lösenord");
            } 
                else{

                    for(int i = 0; i < pass.length(); i++)
                    if(pass.charAt(i) == ){

                    }
                    else{
                    System.out.println("Lösenord är gilltigt");
                    break;
                }    
                }
            }
        }
    }
}
