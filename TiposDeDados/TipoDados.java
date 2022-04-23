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

        // TIPOS DECIMAIS
        float valorFloat1 = 3.14F;
        double valorDouble1 = 1.344;
        
        // LOGICOS
        boolean valorLogico = true; // false

        // CHARS
        char c = '!'; // Aspas simples

        // TEXTUAIS
        String textual = "Mensagem ...1342"; // Aspas duplas

        // System.out.println(idade);
        
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
        // System.out.println(tord);

        // Receba dois numeros a e b.
        // Processar em todas as operacoes artimeticas (+, -, /, *).
        // Saida com os resutaldos

        // System.out.print("Digite o primeiro numero: ");
        // int numero1 = entrada.nextInt();

        // System.out.print("Digite o segundo numero: ");
        // int numero2 = entrada.nextInt();

        // System.out.println("A soma de " + numero1 + " com " + numero2 + " = " + (numero1 + numero2));

        // // Double
        // double valorDouble = entrada.nextDouble();
        // float valorFloat = entrada.nextFloat();

        // Tipo Textual
        // System.out.print("Nome: ");
        // String nome = entrada.nextLine();

        // System.out.println("Meu nome eh: " + nome);
        // int aa = entrada.nextInt();

        // Operadores Logicos
        int valorA = 10;
        int valorB = 11;

        // Comparacao (igualdade)
        boolean comparacaoIgualdade = valorA == valorB; // FALSE

        // Comparacao (diferenca)
        boolean comparacaoDiferenca = valorA != valorB; // TRUE

        // Maior que: >
        // Menor que: <
        // Maior igual: >=
        // Menor igual: <=

        // Negacao
        boolean negacao = !(valorA == valorB); // FALSE -> TRUE
        System.out.println("!(valorA == valorB): " + negacao);
    }
}
