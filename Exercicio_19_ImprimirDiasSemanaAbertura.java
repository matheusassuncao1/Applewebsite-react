public class Exercicio_19_ImprimirDiasSemanaAbertura {
    public static void main(String[] args) {
        String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };
        int dia = 0;

        System.out.println("Dias em que a padaria está aberta:");
        while (dia < diasDaSemana.length) {
            if (dia < 5) {
                System.out.println(diasDaSemana[dia]);        
            }
            dia++;
        }

        System.out.println("\nDias em que a padaria está fechada:");
        dia = 0; // Reinicia o contador
        while (dia < diasDaSemana.length) {
            if (dia == 5 || dia == 6) { // Dias fechados (sábado, domingo)
                System.out.println(diasDaSemana[dia]);
            }
            dia++;
        }
    }
}