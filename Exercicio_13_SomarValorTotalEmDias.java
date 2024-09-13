public class Exercicio_13_SomarValorTotalEmDias {
    public static void main(String[] args) {
        double totalVendas = 0;

        for(int dia = 1; dia <= 5; dia++)
        {
            double vendaMediaDoDia = 350;
            totalVendas += vendaMediaDoDia;
        }
        System.out.println("O valor total das vendas nos 5 dias é: R$" + totalVendas);
    }
       
}
