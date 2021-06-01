/*
* Aluno: Pedro Domingues
* Faça um programa que leia o nome do vendedor, seu salário fixo e o valor total da
* venda feita por ele mesmo no mês (em dinheiro). Considerando que esse vendedor recebe
* 15% sobre todos os produtos vendidos, escreva o salário final (total) desse vendedor
* no final do mês, com duas casas decimais.
*
* - Não se esqueça de imprimir o final da linha após o resultado, caso contrário 
* receberá “ Erro de apresentação ”.
*
* - Não se esqueça dos espaços em branco.
*
* Entrada
* O arquivo de entrada contém um texto (nome do funcionário) e dois valores de precisão
* dupla, que são o salário do vendedor e o valor total vendido por ele.
*
* Resultado
* Imprime o salário total do vendedor, conforme o exemplo dado.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1009 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String name = leitor.next();
                
        double salfix, vendasmes, total;
        
        salfix = leitor.nextDouble();
        vendasmes = leitor.nextDouble();
        
        total = (vendasmes * 0.15) + salfix;
        System.out.printf("Salário final do funcionário, R$ " + String.format("%.2f", total));   
    }    
}
