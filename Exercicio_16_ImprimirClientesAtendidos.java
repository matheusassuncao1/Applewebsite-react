public class Exercicio_16_ImprimirClientesAtendidos {
    public static void main(String[] args) {
        int clienteParaAtender = 24;
        int clienteAtual = 0;
        while (clienteAtual <= clienteParaAtender) {
            clienteAtual++;
            System.out.println("Clientes atendidos: " + clienteAtual);
        }
        System.out.println("Todos os Clientes foram atendidos!");
    }
}
