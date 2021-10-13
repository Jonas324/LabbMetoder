package se.jonas;

public class F4 {

    public void run() {
        int a = 25;

        System.out.println("Summan är " + compute(a));
    }

    private Integer compute(int a) {
        
        String numbers = String.valueOf(a);
        char[] nr = numbers.toCharArray();
        char nr1 = nr[0];
        char nr2 = nr[1];
        int nr11 = Character.getNumericValue(nr1);
        int nr22 = Character.getNumericValue(nr2);
        int sum = nr11 + nr22;
        
        return sum;
    }
}