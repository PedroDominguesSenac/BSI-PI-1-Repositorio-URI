/*
* Aluno: Pedro Domingues
* Leia dois valores inteiros. Em seguida, calcule o produto entre eles e armazene
* o resultado em uma variável chamada PROD . Imprima o resultado como no exemplo abaixo.
*
* Entrada
* O arquivo de entrada contém 2 números inteiros.
*
* Resultado
* Imprima a mensagem "PROD" e PROD de acordo com o exemplo a seguir, com um espaço
* em branco antes e depois do sinal de igual.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1004 {
    
     public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        int A, B, PROD;
        
        A = leitura.nextInt();
        B = leitura.nextInt();
        
        PROD = A * B;
        System.out.println("PROD = "+ PROD);    
    }
}