public class Exercicio_12_CalcularPrecoTotalPaes {
    public static void main(String[] args) {
        int quantidadeDePaes;
        double valorPao = 2.85;

        for(quantidadeDePaes = 1; quantidadeDePaes <= 10; quantidadeDePaes++)
        {
            double precoTotal = valorPao * quantidadeDePaes;
            System.out.println(quantidadeDePaes + "pães custam R$"+ precoTotal);
        }
    }
}
