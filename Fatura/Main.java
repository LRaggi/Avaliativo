/*Crie uma classe chamada Fatura que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
o número do item faturado,
a descrição do item,
a quantidade comprada do item e
o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça os métodos get/set para cada variável de instância. Além disso, forneça um método chamado calcular_valor_fatura que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor. Escreva também um programa de teste (main) que demonstra as capacidades da classe Fatura.
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    class MainClass {
      int numero, quantidade;
      String descricao;
      double preco, valor;
    }
    MainClass produto = new MainClass();
    int numero, quantidade;
    String descricao;
    double preco, valor;
      // input do usuário
      System.out.println("Digite o número do produto: ");
      numero = sc.nextInt();
      System.out.println("Digite a descrição do produto: ");
      descricao = sc.next();
      System.out.println("Digite a quantidade do produto: ");
      quantidade = sc.nextInt();
      System.out.println("Digite o preço do produto: ");
      preco = sc.nextDouble();
    
    
  } 
  // criando o produto
  private class Fatura {

  }
  Fatura produto = new Fatura();
}


 
