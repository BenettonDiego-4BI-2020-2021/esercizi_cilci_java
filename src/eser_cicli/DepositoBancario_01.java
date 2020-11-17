package eser_cicli;
import java.util.Scanner;

public class DepositoBancario_01 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double saldo_iniz,perc_interess,soglia,anni=0;
        System.out.println("inserire saldo iniziale");
        saldo_iniz=inp.nextDouble();
        System.out.println("inserire percentuale d'interesse (solo numero)");
        perc_interess=inp.nextDouble();
        System.out.println("inserire una soglia da raggiungere");
        soglia=inp.nextDouble();
        while(saldo_iniz<soglia){
            double percent=(saldo_iniz/100)*perc_interess;
            saldo_iniz+=percent;
            anni++;
        }
        System.out.println("per raggiungere la soglia di "+(int)soglia+" ci sono voluti "+(int)anni+" anni");
    }
}
