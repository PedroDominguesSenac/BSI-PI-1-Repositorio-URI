/*
* Aluno: Pedro Domingues
* Leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondendo
* a duas notas do aluno. Em seguida, calcule a média do aluno, considerando que a nota
* A tem peso 3,5 e a B tem peso 7,5. Cada nota pode ser de zero a dez, sempre com um dígito
* após a vírgula. Não se esqueça de imprimir o final da linha após o resultado, caso contrário,
* você receberá “Erro de apresentação” . Não se esqueça do espaço antes e depois do sinal de igual.
*
* Entrada
* O arquivo de entrada contém valores de 2 pontos flutuantes com um dígito após o ponto decimal.
*
* Resultado
* Imprima a mensagem “MEDIA” (média em português) e a média do aluno conforme exemplo a seguir,
* com 5 dígitos após a vírgula e com espaço em branco antes e depois do sinal de igual.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1005 {
    
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
        double A, B;
        
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        
        double media = ((A * 3.5) + (B * 7.5))/11;
        System.out.println("MEDIA = " + String.format("%.5f", media));
    }
}  
