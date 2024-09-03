/*
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * SP – R$67.836,43
 * RJ – R$36.678,66
 * MG – R$29.229,88
 * ES – R$27.165,48
 * Outros – R$19.849,53
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
 */

public class Questao4 {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        // Calcula o faturamento total
        double faturamentoTotal = SP + RJ + MG + ES + Outros;

        // Calcula e exibe o percentual de representação de cada estado
        calcularPercentual("SP", SP, faturamentoTotal);
        calcularPercentual("RJ", RJ, faturamentoTotal);
        calcularPercentual("MG", MG, faturamentoTotal);
        calcularPercentual("ES", ES, faturamentoTotal);
        calcularPercentual("Outros", Outros, faturamentoTotal);
    }

    // Função para calcular e exibir o percentual de representação
    private static void calcularPercentual(String estado, double valor, double faturamentoTotal) {
        double percentual = (valor / faturamentoTotal) * 100;
        System.out.printf("Percentual de representação de %s: %.2f%%\n", estado, percentual);
    }
}