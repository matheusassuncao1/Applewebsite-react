public class Exercicio_17_SimularVendaPaes {
    public static void main(String[] args) {
       int estoquePaes = 34;
       int paesVendidos = 0;

       while (estoquePaes > 0)
       {
        estoquePaes--;
        System.out.println("Estoque remunerado: " + estoquePaes);
        paesVendidos++;
        System.out.println("Um pão foi vendido: " + paesVendidos);
       }
       System.out.println("Todos os pães foram vendidos! Foram vendidos " + paesVendidos + " pães.");
    }
}
