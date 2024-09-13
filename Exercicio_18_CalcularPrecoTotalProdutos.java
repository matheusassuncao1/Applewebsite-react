import java.util.Scanner;

public class Exercicio_18_CalcularPrecoTotalProdutos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double preco, total = 0;

        while (true) {
            System.out.print("Digite o preço do produto (0 para sair): ");
            preco = leia.nextDouble();

            if (preco == 0) {
                break;
            }

            total += preco;
        }

        System.out.println("O valor total dos produtos é: R$" + total);
        leia.close();
    }
}
