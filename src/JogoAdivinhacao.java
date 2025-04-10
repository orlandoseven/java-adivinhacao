import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int tentativas = 0;
        int numeroUsuario;
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);

        while (tentativas < 5) {
            System.out.println("Digite um numero de 0 a 100: ");
            numeroUsuario = leitura.nextInt();
            tentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.printf("Voce acertou o numero sorteado %d em %d tentativas", numeroAleatorio, tentativas);
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("O número sorteado é MENOR.");
            } else {
                System.out.println("O número sorteado é MAIOR");
            }
        }

        if (tentativas == 5) {
            System.out.printf("Atingido o limite de %d tentativas.Você não acertou o numero sorteado %d", tentativas, numeroAleatorio);
        }
        leitura.close();
    }

}
