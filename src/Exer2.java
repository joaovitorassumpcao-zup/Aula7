import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso, altura, imc;
        System.out.print("Peso: ");
        peso = scanner.nextFloat();
        System.out.print("\nAltura: ");
        altura = scanner.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
    }
}