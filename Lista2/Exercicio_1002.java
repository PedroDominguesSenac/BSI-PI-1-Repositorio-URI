/*
* Aluno: Pedro Domingues
* A fórmula para calcular a área de uma circunferência é definida como A = π. R 2 . Considerando este problema que π = 3,14159 :
*
* Calcule a área usando a fórmula fornecida na descrição do problema.
*
* Entrada
* A entrada contém um valor de ponto flutuante (precisão dupla), que é a variável R .
*
* Resultado
* Apresente a mensagem “A =” seguida do valor da variável, como no exemplo abaixo, 
* com quatro casas decimais após a vírgula. Use todas as variáveis ​​de precisão dupla. 
* Como todos os problemas, não se esqueça de imprimir o final da linha após o resultado, 
* caso contrário receberá "Erro de apresentação".
 */
package lista2;

import java.util.Scanner;

public class Exercicio_1002 {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        
        double n = 3.14159;
        double raio,area;
        raio = leitor.nextDouble();
        area = n * (raio*raio);
        System.out.println("A="+ String.format("%.4f", area));
      }
}
