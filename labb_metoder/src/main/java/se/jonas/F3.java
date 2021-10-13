package se.jonas;

public class F3 {

    public void run() {
        String str = "The quick brown fox jumps over the lazy dog.";

        System.out.println("Det är " + numberOfWords(str) + " ord i meningen.");
    }

    private Integer numberOfWords(String str) {

        String[] s = str.split(" ");
        int antal = s.length;
        return antal;
    }
    
}
