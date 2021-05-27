/* Aluno: Pedro Domingues
* Leia dois valores inteiros, neste caso, as variáveis ​​A e B. Em seguida, 
* calcule a soma entre eles e atribua à variável SOMA . Escreva o valor desta variável.
* 
* Entrada
* O arquivo de entrada contém 2 números inteiros.
*
* Resultado
* Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço 
* em branco antes e depois do sinal de igual seguido do valor correspondente 
* à soma de A e B. Como todos os problemas, não se esqueça de imprimir o final da linha , 
* caso contrário, você receberá "Erro de apresentação"
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1003 {
 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int A, B, SOMA;
        
        A = leitor.nextInt();
        B = leitor.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}

