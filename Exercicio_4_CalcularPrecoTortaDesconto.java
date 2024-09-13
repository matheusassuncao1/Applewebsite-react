public class Exercicio_4_CalcularPrecoTortaDesconto {
    public static void main(String[] args) {
        double precoTorta = 20.75;
          double descontoTorta = 5.00;
          double valorDesconto = precoTorta * (descontoTorta / 100);
          double precoFinal = precoTorta - valorDesconto;
          System.out.println("Preço original da torta: R$ " + precoTorta);
          System.out.println("Desconto: " + descontoTorta + "%");
          System.out.println("Valor do desconto: R$" + valorDesconto);
          System.out.println("Preço final da torta: R$" + precoFinal);
    }
}
