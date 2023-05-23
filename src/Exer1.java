import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso, excesso;
        System.out.print("Peso: ");
        peso = scanner.nextFloat();
        if (peso > 50.0) {
            excesso = (float) Math.floor(peso - 50.0);
            float multa = (float) 4.0 * excesso;
            System.out.println("Multado! valor é: " + multa);
            return;
        } else {
            System.out.println("Sem multa!");
        }
    }
}
