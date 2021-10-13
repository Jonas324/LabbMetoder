package se.jonas;

public class F2 {

    public void run() {

        System.out.print("Skriv din ålder: ");
        int age = Integer.parseInt(System.console().readLine());
        boolean bool = canBuyBeer(age);

        if (bool == true){
            System.out.println("Du är  gammal nog för att dricka");
        }
        else{
        System.out.println("Du är inte gammal nog");            
        }
    }

    private boolean canBuyBeer(int age) {

        boolean bool = false;

        if(age >= 18){

            bool = true;
        }
        return bool;
    }
    
}
