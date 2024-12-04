package br.com.cafeweb.main;

/*
    Calculadora simples de operações básicas
    e histórico de operações realizadas
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Action options:
            1 -> Calculadora
            2 -> Histórico de operações
            0 -> Sair
         */
        int action = 1;
        int result;
        char operation;
        ArrayList<String> history = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (action != 0) {

            if (action == 1) {
                System.out.println("====== Calculadora ======");
                System.out.print("Informe a operação: ( + ) adição ( - ) subtração ( * ) multiplicação ( / ) divisão ");
                operation = scanner.next().charAt(0);
                System.out.print("Informe o primeiro valor: ");
                int number1 = scanner.nextInt();
                System.out.print("Informe o segundo valor: ");
                int number2 = scanner.nextInt();

                switch (operation) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        result = number1 / number2;
                        break;
                    default:
                        System.out.println("A operação informada não é válida");
                        break;
                }

                String historyAdd = String.format("%d %c %d", number1, operation, number2);
                history.add(historyAdd);
            } else if (action == 2) {
                System.out.println("====== Histórico de operações realizadas ======");
                System.out.printf("Você realizou %d operações", history.size());
                history.forEach(System.out::println);
            }

            System.out.println("O que você deseja fazer agora? ");
            System.out.print("1 -> Calculadora - 2 -> Historico de operações - 0 -> Sair: ");
            action = scanner.nextInt();
        }

        System.out.println("Sistema finalizado");
        scanner.close();
    }
}
