import java.util.Scanner;

public class Exercicio_20_PedirSenhaSistema {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
        String senhaCorreta = "1234"; 
        String senhaDigitada;

        while (true) {
            System.out.print("Digite a senha: ");
            senhaDigitada = leia.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) { //se a senha digitada for equal (igual) a senha correta, então quebra o while
                break; 
            }
            else //se nao informe que tá errado e faça o loop novamente
            {
                System.out.println("\nSenha Incorreta!");
            }
        }

        System.out.println("Senha correta! Acesso permitido.");
        leia.close();
    }
}
