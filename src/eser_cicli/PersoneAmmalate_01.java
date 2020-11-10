
package eser_cicli;

public class PersoneAmmalate_01 {

    public static void main(String[] args) {
        double popolazione=1000, propagazione=1.5,giorni=0, ammalati=1;
        
        while(ammalati<=popolazione/2){
            double old_ammalati=ammalati;
            ammalati*=propagazione;
            ammalati+=old_ammalati;
            giorni+=1;
        }
        System.out.println("ci vogliono "+(int)giorni+" giorni per infettare almeno metà popolazione, ovvero "+(int)popolazione/2+" persone");
        
    }
    
}
