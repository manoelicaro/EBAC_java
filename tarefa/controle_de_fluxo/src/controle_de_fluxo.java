/*
- Fazer a leitura das notas de 4 alunos.
- Imprimir o resultado de cada aluno no console.
- Fazer uma condicional e validar se essa nota é maior ou menor que 7.
- Caso maior ou igual que 7 imprima “Aprovado”.
- Caso menor ou igual a 5 e menor que 7 imprima "Recuperação".
- Caso menor que 5 imprima “Reprovado”.
- Ler no console a média das notas.
- Fazer uma condicional e validar se a média é maior ou menor que 7.
- Caso maior ou igual que 7 imprima “Aprovado”.
- Caso seja maior ou igual a 5 e menor que 7 imprima “Recuperação”.
- Caso menor que 5 imprima “Reprovado”.
- Versionar o código em uma pasta "tarefa/controleDeFluxo" e fazer o push para o GitHub.
 */

import java.util.Scanner;

public class controle_de_fluxo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner s = new Scanner(System.in);

        // Cria um array para armazenar as notas dos 4 alunos
        double[] notas = new double[4];

        // Variável para armazenar a soma das notas
        double soma = 0;

        // Loop para ler as notas dos 4 alunos
        for (int i = 0; i < 4; i++) {
            // Solicita a nota do aluno
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");

            // Ler a nota do aluno e armazena no array
            notas[i] = s.nextDouble();

            // Verifica a nota e imprime o resultado correspondente
            if (notas[i] >= 7) {
                System.out.println("Aprovado");
            } else if (notas[i] >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }

            // Adiciona a nota à soma total
            soma += notas[i];
        }

        // Calcula a média das notas
        double media = soma / 4;

        // Imprime a média das notas
        System.out.println("Média: " + media);

        // Verifica a média e imprime o resultado correspondente
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}