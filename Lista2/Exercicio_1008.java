/*
* Aluno: Pedro Domingues
* Escreva um programa que leia o número do funcionário, o número de horas trabalhadas
* em um mês e o valor que ele recebeu por hora. Imprima o número do funcionário e o salário
*
* que receberá no final do mês, com duas casas decimais.
* Não se esqueça de imprimir o final da linha após o resultado, caso contrário
* você receberá “Erro de apresentação”.
* Não se esqueça do espaço antes e depois do sinal de igual e depois do U $.
* Entrada
* O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante,
* representando o número, a quantidade de horas trabalhadas e a quantidade que o 
* funcionário recebe por hora trabalhada.
*
* Resultado
* Imprima o número e o salário do funcionário, conforme o exemplo dado, com um 
* espaço em branco antes e depois do sinal de igual.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1008 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n, h;        
        float valorh, sal;
        
        n = leitor.nextInt();
        h = leitor.nextInt();
        valorh = leitor.nextFloat();
        
        sal = (h * valorh);
        
        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = U$ "+ String.format("%.2f", sal));
    }
}