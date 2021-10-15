package se.jonas;

import java.util.*;

public class F6 {

    public void run() {
        ArrayList<String> str = new ArrayList<String>();
        str.add("hej");
        str.add("hejsan");
        str.add("hallå");

        System.out.println("The longest word in the list is " + HittaLangstaOrdet(str));
    }

    public String HittaLangstaOrdet(ArrayList<String> str) {
        String longestWord = "";
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() > longestWord.length()) {
                longestWord = str.get(i);
            }

        }
        return longestWord;
    }

}