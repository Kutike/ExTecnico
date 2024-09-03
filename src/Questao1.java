/*
 * Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }Imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 */

public class Questao1 {
    public static void main(String[] args) {

        calcularSoma(13);
    }

    private static void calcularSoma(int INDICE) {
        int SOMA = 0;

        for (int K = 0; K <= INDICE; K++) {
            SOMA += K;
        }

        System.out.println("Para INDICE = " + INDICE + ", o resultado da variável SOMA é: " + SOMA);
    }
}