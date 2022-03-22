package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int vlrInicial=0;
        int vlrFinal=0;
        boolean flag = true;

        while(flag){
            vlrInicial = ent.nextInt();
            if(vlrInicial < 1){

                System.out.println("O valor inicial tem que ser maior que 0.");

            }else{
                flag = false;
            }
        }
        flag = true;
        while(flag){
            vlrFinal = ent.nextInt();
            if(vlrFinal < vlrInicial){

                System.out.println("O valor final tem que ser maior que o valor inicial.");
            }else{
                flag = false;
            }

        }


        for(int i = vlrInicial; i <= vlrFinal; i++){

            if(i % 2 != 0){
                System.out.print(i + " ");

            }
        }

    }
}
