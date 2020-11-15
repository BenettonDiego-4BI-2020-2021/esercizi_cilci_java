package eser_cicli;
import java.util.Scanner;

public class MCD_01 {

    public static void main(String[] args) {
        int resto,primo_n,secondo_n;
        Scanner inp = new Scanner(System.in);
        System.out.println("inserire il primo numero");
        primo_n= inp.nextInt();
        System.out.println("inserire secondo numero");
        secondo_n=inp.nextInt();
        while(secondo_n != 0){
         resto = primo_n % secondo_n;
         primo_n = secondo_n; 
         secondo_n = resto;
        }
        System.out.println("ecco il massimo comun divisore tra i due numeri-> "+primo_n);
    }
    
}
