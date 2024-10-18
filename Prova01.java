
package com.mycompany.prova01;

import java.util.Scanner;

/**
 * * @author Jataiza Barboza
 */
public class Prova01 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto no exterior: ");
        double valorProduto = scanner.nextDouble();

        // Faz a verificação se o usuário digitou numero positivo
        if (valorProduto <= 0) {
            System.out.println("Valor inválido, tente novamente mais tarde.");
            return;
        }

        // Frete desejado pelo usuário
        System.out.println("SELECIONE O SEU TIPO DE FRETE:");
        System.out.println("1 - Frete demorado:");
        System.out.println("2 - Frete medio:");
        System.out.println("3 - Frete rapido:");
        int tipoFrete = scanner.nextInt();

        // Definindo as variáveis para a taxa de frete e a mensagem de escolha de frete
        double taxaFrete = 0;
        String mensagemFrete = "PARABENS QUERIDO SUA OPCAO DE FRETE FOI SELECIONADA COM SUCESSO";
        System.out.println(mensagemFrete);

        
        switch (tipoFrete) {
            case 1:
                taxaFrete = 0.10 * valorProduto;
                mensagemFrete = "Frete demorado escolhido!";
                break;
            case 2:
                taxaFrete = 0.15 * valorProduto; 
                mensagemFrete = "Frete medio escolhido!";
                break;
            case 3:
                taxaFrete = 0.20 * valorProduto; 
                mensagemFrete = "Frete rapido escolhido!";
                break;
            default:
                System.out.println("Opcao de frete invalida, tente novamente mais tarde.");
                return;
        }

        
        double taxaImportacao = 0.60 * valorProduto;

       
        double valorFinal = valorProduto + taxaImportacao + taxaFrete;

        
        System.out.println(mensagemFrete);
        System.out.printf("Taxa de importacao: R$ %.2f%n", taxaImportacao);
        System.out.printf("Valor do frete: R$ %.2f%n", taxaFrete);
        System.out.printf("Valor final da importacao: R$ %.2f%n", valorFinal);
        
        scanner.close();
    }
}
