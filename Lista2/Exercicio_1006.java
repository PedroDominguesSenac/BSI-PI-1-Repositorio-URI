/*
* Aluno: Pedro Domingues
* Leia três valores (variáveis ​​A, B e C), que são as três notas do aluno. Em seguida,
* calcule a média, considerando que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
* Considere que cada nota pode ir de 0 a 10,0, sempre com uma casa decimal.
*
* Entrada
* O arquivo de entrada contém 3 valores de pontos flutuantes com um dígito após o ponto decimal.
*
* Resultado
* Imprima a mensagem "MEDIA" (média em português) e a média do aluno conforme exemplo a seguir,
* com um espaço em branco antes e depois do sinal de igual.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1006 {
  
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        double A, B, C, MEDIA;
        
        A = leitura.nextDouble();
        B = leitura.nextDouble();
        C = leitura.nextDouble();
        
        MEDIA = (A*2 + B*3 + C*5)/10;
        System.out.println("MEDIA = "+ String.format("%.1f",MEDIA));
    }
}
