import java.util.Arrays;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        int acuDias;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua idade.\n Anos: ");
        int idadeAnos = scanner.nextInt();
        System.out.print("Meses: ");
        int idadeMeses = scanner.nextInt();
        System.out.print("Dias: ");
        acuDias = scanner.nextInt();
        acuDias += (idadeAnos * 365) + (idadeMeses * 30);
        System.out.println("Sua idade em dias: " + acuDias);
    }
}
