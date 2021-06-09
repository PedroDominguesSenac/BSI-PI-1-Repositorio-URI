/*
* Aluno: Pedro Domingues
* Neste problema, a tarefa é ler o código de um produto 1, o número de unidades do
* produto 1, o preço de uma unidade do produto 1, o código de um produto 2, o número
* de unidades do produto 2 e o preço para uma unidade do produto 2. Após, calcule e 
* mostre o valor a ser pago.
*
* Entrada
* O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores: 
* dois inteiros e um valor flutuante com 2 dígitos após a vírgula decimal.
*
* Resultado
* O arquivo de saída deve ser uma mensagem como o exemplo a seguir, onde "Valor a pagar" 
* significa Valor a pagar . Lembre-se do espaço após ":" e após o símbolo "R $". O valor 
* deve ser apresentado com 2 dígitos após o ponto.
 */


package lista2;

import java.util.Scanner;

public class Exercicio_1010 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int a, b, c, d;
        double total1, total2, VALOR_A_PAGAR;
        
        a = leitor.nextInt();
        b = leitor.nextInt();
        total1 = leitor.nextDouble();
        
        c = leitor.nextInt();
        d = leitor.nextInt();      
        total2 = leitor.nextDouble();
        
        VALOR_A_PAGAR = b * total1 + d * total2;
        System.out.println("Valor a Pagar: R$ " + String.format("%.2f", VALOR_A_PAGAR));    
    }
}
