/*
 * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 * O menor valor de faturamento ocorrido em um dia do mês;
 * O maior valor de faturamento ocorrido em um dia do mês;
 * Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */

public class Questao3 {
    public static void main(String[] args) {
        // Exemplo de vetor de faturamento diário
        double[] faturamentos = { 1200.0, 850.0, 900.0, 1450.0, 1100.0, 0.0, 980.0, 1100.0, 0.0, 1250.0, 1150.0, 900.0,
                1400.0, 1300.0, 1350.0, 1550.0, 1000.0, 1300.0, 1150.0, 1600.0, 0.0, 1700.0, 1500.0, 1800.0, 1100.0,
                950.0, 0.0, 1400.0, 1600.0, 1650.0 };

        // Inicializa variáveis para calcular menor e maior faturamento
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0; // Contar apenas dias com faturamento > 0

        // Percorre o vetor para calcular o menor, maior e soma dos faturamentos
        for (double faturamento : faturamentos) {
            if (faturamento > 0) { // Considera apenas dias com faturamento > 0
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        // Calcula a média mensal de faturamento
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Conta o número de dias com faturamento superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentos) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento);
        System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento);
        System.out.println("Número de dias no mês com faturamento diário superior à média mensal: " + diasAcimaDaMedia);
    }
}