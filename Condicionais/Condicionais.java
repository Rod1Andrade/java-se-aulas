import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        // Condicional -> se (operacao): fazer algo...
        /**
            Inicio
            Recebo idade
            se (idade > 18): fazer algo...
                entra na balada.
            senao se (idade > 16 && acompanhado_com_o_pai): 
                entra na balada.
            senao: fazer outra operacao...
                Nao entra na balada.
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("entra ai...");
        } else if(idade >= 16) {
            System.out.print("seus pais estao ai? [s/n]: ");
            String c = sc.next();
            boolean acompanhadoComPai = c.equals("s");

            if(acompanhadoComPai) {
                System.out.println("entra ai filha e pai...");
            } else {
                System.out.println("Liga para o seu pai que tu entra ....");
            }
        } else {
            System.out.println("nao tem como entrar ....");
        }

        System.out.println("10 pessoa ja entraram...");
    }
}