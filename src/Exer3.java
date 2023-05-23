import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário: ");
        float salario = scanner.nextFloat();
        System.out.println("Quantidade de salários minimos: " + (salario / 1212.0));
    }
}
