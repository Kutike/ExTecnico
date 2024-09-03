/*
 *  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
 * pertence ou não a sequência.
 * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */

import java.util.*;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele faz parte da sequência de Fibonacci:");
        int numero = entrada.nextInt();

        // Inicializa os dois primeiros números da sequência
        int a = 0;
        int b = 1;

        // Verifica se o número é 0 ou 1
        if (numero == 0 || numero == 1) {
            System.out.println("Esse número pertence à sequência de Fibonacci");
            entrada.close();
            return;
        }

        // Calcula a sequência de Fibonacci até o número inserido
        int calculo = a + b;
        boolean pertence = false;

        while (calculo <= numero) {
            if (calculo == numero) {
                pertence = true;
                break;
            }

            // Atualiza os valores para o próximo número na sequência
            a = b;
            b = calculo;
            calculo = a + b;
        }

        // Verifica se o número pertence à sequência de Fibonacci
        if (pertence) {
            System.out.println("Esse número pertence à sequência de Fibonacci");
        } else {
            System.out.println("Esse número não pertence à sequência de Fibonacci");
        }

        // Fecha o scanner
        entrada.close();
    }
}
