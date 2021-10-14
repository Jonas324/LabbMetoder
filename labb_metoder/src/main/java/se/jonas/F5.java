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
            final String numbers = "1234567890"; 
            char[] numList = numbers.toCharArray();
            int count = 0;

            if (b && pass.length() < 8 && count > 2) {
                System.out.println("ogiltigt lösenord");
            } 
            else{
                for(int i = 0; i < pass.length(); i++){
                    for(int x = 0; x < numList.length; x++){
                        if(pass.charAt(i) == numList[x]){
                            count++;  
                        }
                    }
                }
                if (count >= 2){
                    System.out.println("Lösenord är gilltigt");
                    break;
                }      
            }    
        }
    }
}

