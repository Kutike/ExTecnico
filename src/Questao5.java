/*
 * 5) Escreva um programa que inverta os caracteres de um string.
 * 
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class Questao5 {
    public static void main(String[] args) {
        // Definindo a string a ser invertida
        String original = "Exemplo de string"; // ou você pode usar uma entrada do usuário
        
        // Chamando a função para inverter a string
        inverterString(original);
    }

    // Função para inverter os caracteres de uma string
    private static void inverterString(String texto) {
        String invertida = ""; // Variável para armazenar a string invertida

        // Percorre a string do final para o início e concatena os caracteres
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        // Exibe o resultado da string invertida
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + invertida);
    }
}