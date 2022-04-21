// https://docs.oracle.com/javase/8/docs/api/index.html
import java.util.Scanner;

public class TipoDados {
    public static void main(String[] args) {

        // Tipos de dados primitivos
        // TIPOS INTEIROS
        byte idade; // Inicializando a variavel
        short numeroPequeno = 32000;
        idade = 23; // Atribuindo o valor
        int numeroInteiro = 233;
        long numeroLongo = 12L;

        System.out.println(idade);
        
        // Salva
        // Compila: javac TipoDados.java ou *.java
        // Executa: java TipoDados

        // Entrada -> Processamento -> Saida
        // System.out.println
        // Instancia objeto que lida com entrada de dados.
        Scanner entrada = new Scanner(System.in);
        // int entradaInteiro = entrada.nextInt();
        // System.out.println(entradaInteiro);

        // OPERACOES ARITIMETICAS
        int a = 10;
        int b = 10;

        int tord = a / b;
        System.out.println(tord);

        // Receba dois numeros a e b.
        // Processar em todas as operacoes artimeticas (+, -, /, *).
        // Saida com os resutaldos
    }
}
