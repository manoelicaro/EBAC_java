/**
 * @author icarogaldino
 */

/** Primeiro exemplo de casting de primitivos para wrapper
 * Atualizado em 01.08.2021 as 11:28
 * Versão 0.1 - Após feedback do professor do dia 31.07.2021 as 23:35
 * Update: Inclusão da conversão de primitivos para wrapper
 */

//Criar uma classe
public class Exemplo {
    public static void main(String[] args) {
        //Variáveis primitivas
        byte byteP = 10;
        short shotP = 20;
        int intP = 150;

        //Impressão dos valores primitivos
        System.out.println(byteP);
        System.out.println(shotP);
        System.out.println(intP);

        //Casting de primitivos para wrapper
        Byte byteW = byteP;
        Short shortW = shotP;
        Integer intW = intP;

        //Impressão dos valores wrapper
        System.out.println(byteW);
        System.out.println(shortW);
        System.out.println(intW);
    }
}