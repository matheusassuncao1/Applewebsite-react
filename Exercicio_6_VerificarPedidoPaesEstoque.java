public class Exercicio_6_VerificarPedidoPaesEstoque {
    public static void main(String[] args) {
        int pedidoPaes = 23;
        int quantidadeEstoque = 45;

        if(quantidadeEstoque < pedidoPaes)
        {
            System.out.println("Estoque Insuficiente");
        } else {
            System.out.println("Pedido atendido");

        }
    }
}
