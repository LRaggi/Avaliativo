
  private class Fatura {
  private int numero;
  private String descricao;
  private int quantidade;
  private double preco;
    

  // Inicializar o produto
  private void inicializarFatura(int numero, String descricao, int quantidade, double preco) {
    this.numero = numero;
  }
      private int GetNumero() {
      return numero;
    }
    private void SetNumero(int numero) {
      this.numero = numero;
    }
    private String GetDescricao() {
      return descricao;
    }
    private void SetDescricao(String descricao) {
      this.descricao = descricao;
    }
    private int GetQuantidade() {
      return quantidade;
    }
    private void SetQuantidade(int quantidade) {
      this.quantidade = quantidade;
    }
    private double GetPreco() {
      return preco;
    }
    private void SetPreco(double preco) {
      this.preco = preco;
    
    //condições especiais das variáveis
    if (quantidade < 0) {
      this.quantidade = 0;
    } else if (preco < 0) {
      this.preco = 0.0;
    }
    }
 public void imprimir() {
    System.out.println("Número: " + numero);
    System.out.println("Descrição: " + descricao);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Preço: " + preco);

   // método de cálculo da fatura
    public double calcularFatura(){
      double valorFatura = quantidade * preco;
      System.out.println("Valor da fatura: " + valorFatura);
      return valorFatura;
    }
}
     
   
   

   
}