import java.util.Scanner;

public class Menu {

    // atributos
    double num1, num2, num3 ,resultado;
    String operacao;
    boolean continuar = true;
    Scanner sc;

    // métodos

    public void calculadora() {
        // para usar a calculadora - biblioteca de Scanner
        try (Scanner sc = new Scanner(System.in)) { // permite entrada de dados
            // usar um laço de repetição
            // do - while
            do {
                System.out.println("===Calculador Simples===");
                System.out.println("===Escolha a Operação");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. raiz quadrada");
                System.out.println("6. potenciação");
                System.out.println("7. Sair");
                System.out.println("=========================");
                // le o que o usuário digitou
                if (!sc.hasNext()) {
                    System.out.println("Entrada encerrada. Saindo...");
                    continuar = false;
                    break;
                }
                operacao = sc.next();
                // Escolhi a Operação -> Decisão
                calculos cl = new calculos();
                switch (operacao) {
                    case "1":
                        digiteNumeros();
                        resultado = cl.soma(num1, num2, num3);
                        System.out.println("O Resultado é " + resultado);
                        break;
                    case "2":
                        digiteNumeros();
                        resultado = cl.subtracao(num1, num2);
                        System.out.println("O Resultado é " + resultado);
                        break;
                    case "3":
                        digiteNumeros();
                        resultado = cl.multiplicacao(num1, num2);
                        System.out.println("O Resultado é " + resultado);
                        break;
                    case "4":
                        digiteNumeros();
                        // verificar se o nº 2 não é zero
                        if (num2 == 0) {
                            System.out.println("Não Dividirás por Zero");
                        } else {
                            resultado = cl.divisao(num1, num2);
                            System.out.println("O Resultado é " + resultado);
                        }
                        break;
                    case "5":
                       raiz();
                        resultado = cl.raizQuadrada(num1);
                        System.out.println("O Resultado é " + resultado);
                        break;
                    case "6":
                        digiteNumeros();
                        resultado = cl.potencia(num1, num2);
                        System.out.println("O Resultado é " + resultado);
                        break;
                    case "7":
                        continuar = false;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Escolha uma Operação Válida");
                        break;
                }

            } while (continuar);
        }
    }

    public void digiteNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Nº 1");
        num1 = sc.nextDouble();// le o valor e converte em double
        System.out.println("Informe o Nº 2");
        num2 = sc.nextDouble();
        // somente para soma, solicitar o terceiro número
        if ("1".equals(operacao)) {
            System.out.println("Informe o Nº 3");
            num3 = sc.nextDouble();
        }
        if ("5".equals(operacao)) {
            System.out.println("Informe o Nº para calcular a raiz quadrada");
            num1 = sc.nextDouble();
        }
    }
     public void raiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Nº 1");
        num1 = sc.nextDouble();// le o valor e converte em double
     }


}
