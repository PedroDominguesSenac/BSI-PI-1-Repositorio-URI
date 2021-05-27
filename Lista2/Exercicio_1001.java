/*
* Aluno: Pedro Domingues
* Leia 2 variáveis, denominadas A e B e fazer a soma dessas duas variáveis, 
* atribuindo o resultado à variável X . Imprima X conforme mostrado abaixo. 
* Imprima a linha final após o resultado, caso contrário, você obterá “ Erro de apresentação ”.
*
* Entrada
* O arquivo de entrada conterá 2 números inteiros.
*
* Resultado
* Imprime a letra X (maiúscula) com um espaço em branco antes e depois do sinal 
* de igual seguido do valor de X, conforme exemplo a seguir.
*
* Obs .: afinal não se esqueça da linha final.
*/

package lista2;

import java.util.Scanner;

public class Exercicio_1001 {
    
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int A = leitura.nextInt();
        int B = leitura.nextInt();
        int X = A + B;
        System.out.println("X = "+ X);
    
    }
}
