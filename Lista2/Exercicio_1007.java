/*
* Aluno: Pedro Domingues
* Leia quatro valores inteiros chamados A, B, C e D. Calcule e imprima a diferença
* dos produtos A e B pelo produto de C e D (A * B - C * D).
*
* Entrada
* O arquivo de entrada contém 4 valores inteiros.
*
* Resultado
* Imprima DIFERENCA (DIFERENÇA em Português) com todas as letras maiúsculas,
* conforme exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1007 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int A, B, C, D, DIF;
        
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        
        DIF = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + DIF);  
    }
}
