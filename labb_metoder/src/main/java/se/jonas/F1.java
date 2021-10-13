package se.jonas;

public class F1 {

    public void run() {
    smallestNumber();        
    }

    private void smallestNumber() {
        int a = 25;
        int b = 37;
        int c = 29;

        if (a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < c){
            System.out.println(b);
        }
        else if (c < a && c < b){
            System.out.println(c);
        }
        else{
            System.out.println("ingen är minst");
        }
    }
    
}
