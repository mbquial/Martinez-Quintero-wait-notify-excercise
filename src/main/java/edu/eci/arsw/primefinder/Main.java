package edu.eci.arsw.primefinder;

public class Main {

    public static void main(String[] args) {
        Control control = Control.newControl();
        
        control.start();

        int cont = 0;
        while (cont< 100){
            cont++;
            System.out.printf("%d, ACA VA ACA VA ACA VA: %n ",cont);
        }
        try {
            control.beginCheckingRounds();
            System.out.printf("%d PRIMOS %n",control.getPrimesFounded());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
	
}
