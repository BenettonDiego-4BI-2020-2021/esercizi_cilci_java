package eser_cicli;

import java.util.Scanner;

public class Alghe_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pop_iniz, obbiettivo,cont=1,anni=0;
        System.out.println("inserire la popolazione iniziale di alghe");
        pop_iniz = inp.nextInt();
        System.out.println("indicare la popolazione che si vuole raggiungrere");
        obbiettivo = inp.nextInt();
        while(pop_iniz<obbiettivo){
            if(cont%2==0){
                int alghe_att=pop_iniz/3;
                pop_iniz-=alghe_att;
            }else{
                pop_iniz*=2;
            }
            cont++;
            anni++;
        }
        System.out.println("per raggiungere la popolazione di "+obbiettivo+" ci ha messo "+anni+" anni");
    }
}
